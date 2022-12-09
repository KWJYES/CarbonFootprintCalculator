package com.example.carbonfootprintcalculator.entity.toursimAndvacation;

import com.example.carbonfootprintcalculator.entity.mealsADay.mealsADay;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class hotel extends mealsADay {
    private double carbonNum;
    private double coefficient = 0.03;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
