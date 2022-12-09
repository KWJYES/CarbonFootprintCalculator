package com.example.carbonfootprintcalculator.entity.transportion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class HightOilCar extends transSportion {
    private double carbonNum;
    private double coefficient = 0.41;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
