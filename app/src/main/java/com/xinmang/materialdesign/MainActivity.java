package com.xinmang.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xinmang.materialdesign.base.AppInfo;
import com.xinmang.materialdesign.bean.CategoryBean;
import com.xinmang.materialdesign.retrofit.RetrofitCategroryService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppInfo.APIURL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();
        RetrofitCategroryService service = retrofit.create(RetrofitCategroryService.class);
        Call<CategoryBean> call = service.getCategory(AppInfo.KEY);
        call.enqueue(new Callback<CategoryBean>() {
            @Override
            public void onResponse(Call<CategoryBean> call, Response<CategoryBean> response) {
                Log.e(TAG, "onResponse: " + response.body().getResult().getChilds().get(0).getChilds().get(0).getCategoryInfo().getName());
            }

            @Override
            public void onFailure(Call<CategoryBean> call, Throwable t) {

            }
        });
    }
}
