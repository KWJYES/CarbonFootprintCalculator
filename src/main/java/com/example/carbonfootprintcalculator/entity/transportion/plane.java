package com.example.carbonfootprintcalculator.entity.transportion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class plane extends transSportion {
    private double carbonNum;
    private double coefficient = 0.28;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
