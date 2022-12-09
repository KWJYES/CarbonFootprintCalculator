package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class lentil extends mealsADay {
    private double carbonNum;
    private double coefficient = 0.90;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
