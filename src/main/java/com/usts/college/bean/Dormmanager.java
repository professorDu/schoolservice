package com.usts.college.bean;

import javax.validation.constraints.Pattern;

public class Dormmanager {
    private Integer dormId;

    private String dormName;
    
    @Pattern(regexp="^[a-zA-Z0-9_-]{6,16}$",message="用户名为6-16位英文和数字的组合")
    private String dormUsername;

    private String dormPassword;

    private String dormGender;

    @Pattern(regexp="^1(3|4|5|7|8)\\d{9}$",message="电话格式不正确")
    private String dormTel;

    private Integer apartPid;
    
    private Apart apart;
    
    

    public Dormmanager() {
		super();
	}

	public Dormmanager(Integer dormId, String dormName, String dormUsername, String dormPassword, String dormGender,
			String dormTel, Integer apartPid) {
		super();
		this.dormId = dormId;
		this.dormName = dormName;
		this.dormUsername = dormUsername;
		this.dormPassword = dormPassword;
		this.dormGender = dormGender;
		this.dormTel = dormTel;
		this.apartPid = apartPid;
	}

	public Apart getApart() {
		return apart;
	}

	public void setApart(Apart apart) {
		this.apart = apart;
	}

	public Integer getDormId() {
        return dormId;
    }

    public void setDormId(Integer dormId) {
        this.dormId = dormId;
    }

    public String getDormName() {
        return dormName;
    }

    public void setDormName(String dormName) {
        this.dormName = dormName == null ? null : dormName.trim();
    }

    public String getDormUsername() {
        return dormUsername;
    }

    public void setDormUsername(String dormUsername) {
        this.dormUsername = dormUsername == null ? null : dormUsername.trim();
    }

    public String getDormPassword() {
        return dormPassword;
    }

    public void setDormPassword(String dormPassword) {
        this.dormPassword = dormPassword == null ? null : dormPassword.trim();
    }

    public String getDormGender() {
        return dormGender;
    }

    public void setDormGender(String dormGender) {
        this.dormGender = dormGender == null ? null : dormGender.trim();
    }

    public String getDormTel() {
        return dormTel;
    }

    public void setDormTel(String dormTel) {
        this.dormTel = dormTel == null ? null : dormTel.trim();
    }

    public Integer getApartPid() {
        return apartPid;
    }

    public void setApartPid(Integer apartPid) {
        this.apartPid = apartPid;
    }
}