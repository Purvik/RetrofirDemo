
package com.purvik.retrofirdemo.API;

import com.google.gson.annotations.Expose;

import java.util.List;


@SuppressWarnings("unused")
public class RoutineResponse {

    @Expose
    private List<Object> errors;
    @Expose
    private List<List<Routine>> routines;

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public List<List<Routine>> getRoutines() {
        return routines;
    }

    public void setRoutines(List<List<Routine>> routines) {
        this.routines = routines;
    }

}
