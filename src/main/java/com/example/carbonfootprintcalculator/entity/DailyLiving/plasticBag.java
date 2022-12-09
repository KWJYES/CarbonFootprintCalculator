package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class plasticBag extends Dailyliving{
    private double carbonNum;
    private double coefficient = 0.01;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
