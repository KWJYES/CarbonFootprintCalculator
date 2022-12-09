package com.example.carbonfootprintcalculator.entity.DailyLiving;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class pureCottonClothes extends Dailyliving{
    private double carbonNum;
    private double coefficient = 7;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
