package com.usts.college.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Apart {
    private Integer apartId;

    private String apartApa;

    private List<Apartroom> apartrooms = new ArrayList<>();

}