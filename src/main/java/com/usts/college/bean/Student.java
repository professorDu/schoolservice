package com.usts.college.bean;

import lombok.Data;

@Data
public class Student {
    private Integer stuId;

    private String stuNum;

    private String stuPass;

    private String stuName;

    private String stuGender;

    private String stuCollege;

    private Integer apartroomPid;

    private Apartroom apartroom;

}