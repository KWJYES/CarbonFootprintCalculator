package com.example.carbonfootprintcalculator.entity.Electronics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TV extends Electronics {
    private double carbonNum;
    private String itemName;

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private double coefficient = 0.10;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

    @Override
    public double getCarbonNum() {
        return carbonNum;
    }

    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
}
