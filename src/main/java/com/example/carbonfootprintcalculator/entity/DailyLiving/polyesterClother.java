package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class polyesterClother extends Dailyliving{
    private double carbonNum;
    private double coefficient = 25.7;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
