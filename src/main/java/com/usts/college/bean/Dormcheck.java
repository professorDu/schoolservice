package com.usts.college.bean;

import java.util.Date;

public class Dormcheck {
    private Integer dormcheckId;

    private String dormcheckMessage;

    private Date dormcheckDate;

    private Integer apartroomPid;

    public Integer getDormcheckId() {
        return dormcheckId;
    }

    public void setDormcheckId(Integer dormcheckId) {
        this.dormcheckId = dormcheckId;
    }

    public String getDormcheckMessage() {
        return dormcheckMessage;
    }

    public void setDormcheckMessage(String dormcheckMessage) {
        this.dormcheckMessage = dormcheckMessage == null ? null : dormcheckMessage.trim();
    }

    public Date getDormcheckDate() {
        return dormcheckDate;
    }

    public void setDormcheckDate(Date dormcheckDate) {
        this.dormcheckDate = dormcheckDate;
    }

    public Integer getApartroomPid() {
        return apartroomPid;
    }

    public void setApartroomPid(Integer apartroomPid) {
        this.apartroomPid = apartroomPid;
    }
}