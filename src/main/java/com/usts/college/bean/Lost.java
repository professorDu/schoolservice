package com.usts.college.bean;

import java.util.Date;

public class Lost {
    private Integer lostId;

    private String lostTitle;

    private String lostMessage;

    private String lostPlace;

    private Date lostDate;

    public Integer getLostId() {
        return lostId;
    }

    public void setLostId(Integer lostId) {
        this.lostId = lostId;
    }

    public String getLostTitle() {
        return lostTitle;
    }

    public void setLostTitle(String lostTitle) {
        this.lostTitle = lostTitle == null ? null : lostTitle.trim();
    }

    public String getLostMessage() {
        return lostMessage;
    }

    public void setLostMessage(String lostMessage) {
        this.lostMessage = lostMessage == null ? null : lostMessage.trim();
    }

    public String getLostPlace() {
        return lostPlace;
    }

    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace == null ? null : lostPlace.trim();
    }

    public Date getLostDate() {
        return lostDate;
    }

    public void setLostDate(Date lostDate) {
        this.lostDate = lostDate;
    }
}