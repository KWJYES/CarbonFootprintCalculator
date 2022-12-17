package com.example.carbonfootprintcalculator.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private double carbonNum;
    private Date date;
    private String uname;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getCarbonNum() {
        return carbonNum;
    }

    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }
}
