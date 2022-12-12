package com.example.carbonfootprintcalculator.entity.commercialOffice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class searchEngines extends commercialOffice {
    private double carbonNum;
    private double coefficient = 0.003;
    private String itemName;

    @Override
    public double getCarbonNum() {
        return carbonNum;
    }

    @Override
    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    @Override
    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }
}
