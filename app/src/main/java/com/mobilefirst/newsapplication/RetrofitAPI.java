package com.mobilefirst.newsapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Sivaji on 09-02-2022.
 */
public interface RetrofitAPI {
    @GET
    Call<NewsModel> getAllNews(@Url String url);
    @GET
    Call<NewsModel> getNewsByCategory(@Url String url);
}
