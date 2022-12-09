package com.example.carbonfootprintcalculator.entity.DailyLiving;

import com.example.carbonfootprintcalculator.entity.Electronics.Electronics;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class washingDispenserinsulation extends Electronics {
    private double carbonNum;
    private double coefficient = 0.03;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
