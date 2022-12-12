package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class coalGas extends Dailyliving{
    private double carbonNum;
    private double coefficient = 0.71;
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
