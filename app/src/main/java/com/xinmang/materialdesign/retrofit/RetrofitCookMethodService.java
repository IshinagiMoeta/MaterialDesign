package com.xinmang.materialdesign.retrofit;

import com.xinmang.materialdesign.bean.CategoryBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ketianxing on 2017/11/6.
 */

public interface RetrofitCookMethodService {
    @GET("menu/query")
    Call<CategoryBean> getCategory(@Query("key") String key,
                                   @Query("id") String id);
}
