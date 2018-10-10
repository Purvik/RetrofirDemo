package com.purvik.retrofirdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.purvik.retrofirdemo.API.RoutineRequest;
import com.purvik.retrofirdemo.singleton.SingleUser;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.purvik.retrofirdemo.API.MyApplication.apiCall;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        RoutineRequest routineRequest = new RoutineRequest();
        routineRequest.setLoginuserID(Long.parseLong("32"));
        routineRequest.setSchoolId(Long.parseLong("9"));
        routineRequest.setSchoolyearID(Long.parseLong("1"));
        routineRequest.setUsertypeID(Long.parseLong("4"));

        Call< List<SingleUser>> call = apiCall.getUserData();
        call.enqueue(new Callback<List<SingleUser>>() {
            @Override
            public void onResponse(Call<List<SingleUser>> call, Response<List<SingleUser>> response) {

                Toast.makeText(getApplicationContext(),"Success:\n"+ response.code(), Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<List<SingleUser>> call, Throwable t) {

                Toast.makeText(getApplicationContext(),"Failure:\n"+ t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });




    }
}
