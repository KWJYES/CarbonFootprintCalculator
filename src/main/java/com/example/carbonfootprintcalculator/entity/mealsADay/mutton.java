package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class mutton extends mealsADay {
    private double carbonNum;
    private double coefficient = 39.20;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
