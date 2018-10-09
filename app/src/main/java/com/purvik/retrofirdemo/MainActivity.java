package com.purvik.retrofirdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;


import com.purvik.retrofirdemo.API.ApiCall;
import com.purvik.retrofirdemo.API.RoutineRequest;
import com.purvik.retrofirdemo.API.RoutineResponseData;
import static com.purvik.retrofirdemo.API.MyApplication.apiCall;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView mainTvView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTvView = findViewById(R.id.mainTvView);

        RoutineRequest routineRequest = new RoutineRequest();
        routineRequest.setLoginuserID(Long.parseLong("32"));
        routineRequest.setSchoolId(Long.parseLong("9"));
        routineRequest.setSchoolyearID(Long.parseLong("1"));
        routineRequest.setUsertypeID(Long.parseLong("4"));

        Call<RoutineResponseData> call = apiCall.get_routine_data(routineRequest);
        call.enqueue(new Callback<RoutineResponseData>() {
            @Override
            public void onResponse(Call<RoutineResponseData> call, Response<RoutineResponseData> response) {

                mainTvView.setText("Code:" + response.code());

            }

            @Override
            public void onFailure(Call<RoutineResponseData> call, Throwable t) {

                mainTvView.setText("Failure:\n"+ t.getMessage());
            }
        });




    }
}
