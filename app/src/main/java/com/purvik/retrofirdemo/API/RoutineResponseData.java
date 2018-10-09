package com.purvik.retrofirdemo.API;

/**
 * Created by Purvik Rana on 05-10-2018.
 */
public class RoutineResponseData {

    private String message;

    private String code;

    RoutineResponse data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public RoutineResponse getData() {
        return data;
    }

    public void setData(RoutineResponse data) {
        this.data = data;
    }
}
