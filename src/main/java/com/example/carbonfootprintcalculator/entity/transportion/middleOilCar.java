package com.example.carbonfootprintcalculator.entity.transportion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class middleOilCar extends transSportion {
    private double carbonNum;
    private double coefficient = 0.30;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
