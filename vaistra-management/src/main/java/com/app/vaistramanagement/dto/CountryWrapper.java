package com.app.vaistramanagement.dto;


import lombok.Data;

@Data
public class CountryWrapper
{

    private Integer No;
    private String  COUNTRY;
    private  String STATUS;

    public CountryWrapper(Integer No, String COUNTRY, String  STATUS) {

        this.No = No;
        this.COUNTRY = COUNTRY;
        this.STATUS =STATUS;

    }



}
