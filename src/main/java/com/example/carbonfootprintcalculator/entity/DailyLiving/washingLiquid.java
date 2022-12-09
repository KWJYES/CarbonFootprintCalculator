package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class washingLiquid extends Dailyliving{
    private double carbonNum;
    private double coefficient = 0.8;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
