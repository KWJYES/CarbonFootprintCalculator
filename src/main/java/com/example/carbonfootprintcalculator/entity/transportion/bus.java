package com.example.carbonfootprintcalculator.entity.transportion;

import com.example.carbonfootprintcalculator.entity.transportion.transSportion;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class bus extends transSportion {
    private double carbonNum;
    private double coefficient = 0.01;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
