package com.example.carbonfootprintcalculator.entity.Electronics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class fan extends Electronics {
    private double carbonNum;
    private double coefficient = 0.04;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}