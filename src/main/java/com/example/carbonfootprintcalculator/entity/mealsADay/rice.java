package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class rice extends mealsADay {
    private double carbonNum;
    private double coefficient = 2.7;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
