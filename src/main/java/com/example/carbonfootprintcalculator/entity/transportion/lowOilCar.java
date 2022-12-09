package com.example.carbonfootprintcalculator.entity.transportion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class lowOilCar extends transSportion {
    private double carbonNum;
    private double coefficient = 0.27;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
