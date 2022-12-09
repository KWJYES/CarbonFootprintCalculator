package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Broccoli extends mealsADay {
    private double carbonNum;
    private double coefficient = 2.0;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
