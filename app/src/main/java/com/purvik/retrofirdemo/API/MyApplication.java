package com.purvik.retrofirdemo.API;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Purvik Rana on 05-10-2018.
 */
public class MyApplication extends Application {

    public static Retrofit retrofit;
    public static ApiCall apiCall;

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        //http://localhost:3000/api/
        //http://propathshala.vrithub.in/api/

        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:3000/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiCall = retrofit.create(ApiCall.class);

    }
}
