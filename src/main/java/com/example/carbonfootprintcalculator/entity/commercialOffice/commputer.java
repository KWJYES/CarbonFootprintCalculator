package com.example.carbonfootprintcalculator.entity.commercialOffice;

import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class commputer extends commercialOffice {
    private double carbonNum;
    private double coefficient = 1;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
