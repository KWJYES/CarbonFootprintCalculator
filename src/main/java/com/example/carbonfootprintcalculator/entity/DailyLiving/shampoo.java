package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class shampoo extends Dailyliving{
    private double carbonNum;
    private double coefficient = 0.1;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
