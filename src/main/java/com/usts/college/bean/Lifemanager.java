package com.usts.college.bean;

public class Lifemanager {
    private Integer lifeId;

    private String lifeName;

    private String lifeUsername;

    private String lifePassword;

    private String lifeGender;

    private String lifeTel;

    @Override
    public String toString() {
        return "Lifemanager{" +
                "lifeId=" + lifeId +
                ", lifeName='" + lifeName + '\'' +
                ", lifeUsername='" + lifeUsername + '\'' +
                ", lifePassword='" + lifePassword + '\'' +
                ", lifeGender='" + lifeGender + '\'' +
                ", lifeTel='" + lifeTel + '\'' +
                '}';
    }

    public Integer getLifeId() {
        return lifeId;
    }

    public void setLifeId(Integer lifeId) {
        this.lifeId = lifeId;
    }

    public String getLifeName() {
        return lifeName;
    }

    public void setLifeName(String lifeName) {
        this.lifeName = lifeName == null ? null : lifeName.trim();
    }

    public String getLifeUsername() {
        return lifeUsername;
    }

    public void setLifeUsername(String lifeUsername) {
        this.lifeUsername = lifeUsername == null ? null : lifeUsername.trim();
    }

    public String getLifePassword() {
        return lifePassword;
    }

    public void setLifePassword(String lifePassword) {
        this.lifePassword = lifePassword == null ? null : lifePassword.trim();
    }

    public String getLifeGender() {
        return lifeGender;
    }

    public void setLifeGender(String lifeGender) {
        this.lifeGender = lifeGender == null ? null : lifeGender.trim();
    }

    public String getLifeTel() {
        return lifeTel;
    }

    public void setLifeTel(String lifeTel) {
        this.lifeTel = lifeTel == null ? null : lifeTel.trim();
    }
}