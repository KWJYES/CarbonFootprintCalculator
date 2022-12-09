package com.example.carbonfootprintcalculator.entity.DailyLiving;

import com.example.carbonfootprintcalculator.entity.Electronics.Electronics;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class waterHeater extends Electronics {
    private double carbonNum;
    private double coefficient = 2.40;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
