package com.example.carbonfootprintcalculator.entity.Electronics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class oven extends Electronics {
    private double carbonNum;
    private double coefficient = 0.36;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
