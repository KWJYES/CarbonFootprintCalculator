package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class egg extends mealsADay {
    private double carbonNum;
    private double coefficient = 4.80;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
