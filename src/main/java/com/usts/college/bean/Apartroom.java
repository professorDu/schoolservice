package com.usts.college.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Apartroom {
    private Integer apartroomId;

    private Integer apartPid;

    private String apartroomAbc;

    private String apartroomDorm;

    private Apart apart;

    private List<Student> students = new ArrayList<>();
}