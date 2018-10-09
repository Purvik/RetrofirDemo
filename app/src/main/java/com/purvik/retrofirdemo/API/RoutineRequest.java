
package com.purvik.retrofirdemo.API;

import com.google.gson.annotations.SerializedName;



public class RoutineRequest {

    
    private Long loginuserID;
    @SerializedName("school_id")
    private Long schoolId;
    
    private Long schoolyearID;
    
    private Long usertypeID;

    public Long getLoginuserID() {
        return loginuserID;
    }

    public void setLoginuserID(Long loginuserID) {
        this.loginuserID = loginuserID;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getSchoolyearID() {
        return schoolyearID;
    }

    public void setSchoolyearID(Long schoolyearID) {
        this.schoolyearID = schoolyearID;
    }

    public Long getUsertypeID() {
        return usertypeID;
    }

    public void setUsertypeID(Long usertypeID) {
        this.usertypeID = usertypeID;
    }

}
