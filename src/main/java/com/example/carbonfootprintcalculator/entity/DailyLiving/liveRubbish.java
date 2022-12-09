package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class liveRubbish extends Dailyliving{
    private double carbonNum;
    private double coefficient = 2.06;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
