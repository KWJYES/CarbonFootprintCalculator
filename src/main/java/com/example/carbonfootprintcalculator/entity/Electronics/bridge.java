package com.example.carbonfootprintcalculator.entity.Electronics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class bridge extends Electronics {
    private double carbonNum;
    private double coefficient = 0.83;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
