package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class juice extends mealsADay {
    private double carbonNum;
    private double coefficient = 0.08;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
