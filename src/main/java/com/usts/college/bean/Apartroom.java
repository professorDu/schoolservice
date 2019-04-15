package com.usts.college.bean;

public class Apartroom {
    private Integer apartroomId;

    private Integer apartPid;

    private String apartroomAbc;

    private String apartroomDorm;

    public Integer getApartroomId() {
        return apartroomId;
    }

    public void setApartroomId(Integer apartroomId) {
        this.apartroomId = apartroomId;
    }

    public Integer getApartPid() {
        return apartPid;
    }

    public void setApartPid(Integer apartPid) {
        this.apartPid = apartPid;
    }

    public String getApartroomAbc() {
        return apartroomAbc;
    }

    public void setApartroomAbc(String apartroomAbc) {
        this.apartroomAbc = apartroomAbc == null ? null : apartroomAbc.trim();
    }

    public String getApartroomDorm() {
        return apartroomDorm;
    }

    public void setApartroomDorm(String apartroomDorm) {
        this.apartroomDorm = apartroomDorm == null ? null : apartroomDorm.trim();
    }
}