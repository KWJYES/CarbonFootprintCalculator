package com.example.carbonfootprintcalculator.entity.commercialOffice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class commputer extends commercialOffice {
    private String itemName;
    private double carbonNum;
    private double coefficient = 1;

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public double getCarbonNum() {
        return carbonNum;
    }

    @Override
    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
