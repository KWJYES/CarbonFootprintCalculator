package com.example.carbonfootprintcalculator.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class item {
    public String itemName;
    public double carbonNum;
    public Date date;
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCarbonNum() {
        return carbonNum;
    }

    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }
}
