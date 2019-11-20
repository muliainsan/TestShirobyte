package com.sains.testshirobyte;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.sains.testshirobyte.services.ApiClient;
import com.sains.testshirobyte.services.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv_data);
        Log.e("1q1q", String.valueOf(12345));
        final ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Data> call = apiService.getData();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                int statusCode = response.code();
                Data datas = response.body();
                Log.e("1q1q", String.valueOf(statusCode));
                LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                rv.setLayoutManager(layoutManager);
                Adapter adapter = new Adapter(datas.getData(),  MainActivity.this);
                rv.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Log.e("xxx", t.toString());
            }
        });



    }
}
