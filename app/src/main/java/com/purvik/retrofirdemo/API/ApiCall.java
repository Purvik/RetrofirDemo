package com.purvik.retrofirdemo.API;

import com.purvik.retrofirdemo.singleton.SingleUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Purvik Rana on 05-10-2018.
 */
public interface ApiCall {

    /*@POST("routine")
    Call<RoutineResponseData> get_routine_data(@Body RoutineRequest routineRequest);*/

    @Headers("X-API-Key:920c9fc0")
    @GET("user.json")
    Call<List<SingleUser>> getUserData();

}
