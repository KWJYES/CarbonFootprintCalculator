package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class tomato extends mealsADay {
    private double carbonNum;
    private double coefficient = 2.90;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
