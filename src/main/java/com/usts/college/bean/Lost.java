package com.usts.college.bean;

import lombok.Data;

import java.util.Date;
@Data
public class Lost {
    private Integer lostId;

    private String lostTitle;

    private String lostMessage;

    private String lostPlace;

    private Date lostDate;

}