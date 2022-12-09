package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class peanut extends mealsADay {
    private double carbonNum;
    private double coefficient = 2.50;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
