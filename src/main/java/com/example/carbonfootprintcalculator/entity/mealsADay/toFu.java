package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class toFu extends mealsADay {
    private double carbonNum;
    private double coefficient =2;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
