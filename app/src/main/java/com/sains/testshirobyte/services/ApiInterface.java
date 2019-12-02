package com.sains.testshirobyte.services;
import com.sains.testshirobyte.Data;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("list.php")
    Call<Data> getData();


}
