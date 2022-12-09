package com.example.carbonfootprintcalculator.entity.commercialOffice;

import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class email extends commercialOffice {
    private double carbonNum;
    private double coefficient = 0.04;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }
}
