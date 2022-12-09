package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class chicken extends mealsADay {
    private double carbonNum;
    private double coefficient = 1.80;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
