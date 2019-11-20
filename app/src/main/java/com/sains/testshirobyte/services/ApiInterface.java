package com.sains.testshirobyte.services;

import com.sains.testshirobyte.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("API/list.php")
    Call<Data> getData();


}
