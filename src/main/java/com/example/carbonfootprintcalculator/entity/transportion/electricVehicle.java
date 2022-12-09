package com.example.carbonfootprintcalculator.entity.transportion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class electricVehicle extends transSportion {
    private double carbonNum;
    private double coefficient = 0.05;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
