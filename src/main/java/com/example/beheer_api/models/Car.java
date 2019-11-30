package com.example.beheer_api.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int plate_number;
    private String model;
    private Long price;
    private String color;
    private Long km;
    private Long yrp;
    private String eng_type;


}
