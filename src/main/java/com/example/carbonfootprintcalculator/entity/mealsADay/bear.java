package com.example.carbonfootprintcalculator.entity.mealsADay;

import com.example.carbonfootprintcalculator.entity.mealsADay.mealsADay;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class bear extends mealsADay {
    private double carbonNum;
    private double coefficient = 0.11;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
