package com.usts.college.bean;

public class Supermanager {
    private Integer superId;

    private String superName;

    private String superPass;

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName == null ? null : superName.trim();
    }

    public String getSuperPass() {
        return superPass;
    }

    public void setSuperPass(String superPass) {
        this.superPass = superPass == null ? null : superPass.trim();
    }
}