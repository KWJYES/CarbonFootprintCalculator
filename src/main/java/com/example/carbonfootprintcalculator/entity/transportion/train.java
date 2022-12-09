package com.example.carbonfootprintcalculator.entity.transportion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class train extends transSportion {
    private double carbonNum;
    private double coefficient = 0.01;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
