package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class diningInRestaurants extends mealsADay {
    private double carbonNum;
    private double coefficient = 0.52;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
