package com.example.carbonfootprintcalculator.entity.commercialOffice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class printer extends commercialOffice {
    private double carbonNum;
    private String itemName;
    private double coefficient = 0.08;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

    @Override
    public double getCarbonNum() {
        return carbonNum;
    }

    @Override
    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
