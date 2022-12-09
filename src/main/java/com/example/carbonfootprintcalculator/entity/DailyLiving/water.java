package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class water extends Dailyliving{
    private double carbonNum;
    private double coefficient = 0.91;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
