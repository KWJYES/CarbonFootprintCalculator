package com.example.carbonfootprintcalculator.entity.DailyLiving;

import com.example.carbonfootprintcalculator.entity.DailyLiving.Dailyliving;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class coalGas extends Dailyliving{
    private double carbonNum;
    private double coefficient = 0.71;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
