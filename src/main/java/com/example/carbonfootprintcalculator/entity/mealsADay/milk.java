package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class milk extends mealsADay {
    private double carbonNum;
    private double coefficient = 0.47;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
