package com.usts.college.bean;

import lombok.Data;

import javax.validation.constraints.Pattern;
@Data
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

}