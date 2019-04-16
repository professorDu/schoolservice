package com.usts.college.bean;

import lombok.Data;

@Data
public class Apartroom {
    private Integer apartroomId;

    private Integer apartPid;

    private String apartroomAbc;

    private String apartroomDorm;

    private Apart apart;
}