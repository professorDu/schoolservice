package com.usts.college.bean;

import lombok.Data;

import java.util.Date;
@Data
public class Dormcheck {
    private Integer dormcheckId;

    private String dormcheckMessage;

    private Date dormcheckDate;

    private Integer apartroomPid;

    private Apartroom apartroom;

}