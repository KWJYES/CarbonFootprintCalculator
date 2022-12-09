package com.example.carbonfootprintcalculator.entity.commercialOffice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class searchEngines extends commercialOffice {
    private double carbonNum;
    private double coefficient = 0.003;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }
}
