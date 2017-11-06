package com.xinmang.materialdesign.retrofit;

import com.xinmang.materialdesign.bean.CategoryBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ketianxing on 2017/11/6.
 */

public interface RetrofitMenuService {
    @GET("menu/search")
    Call<CategoryBean> getCategory(@Query("key") String key,
                                   @Query("cid") String cid,
                                   @Query("page") String page,
                                   @Query("size") String size);
}
