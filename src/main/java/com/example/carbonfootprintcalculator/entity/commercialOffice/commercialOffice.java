package com.example.carbonfootprintcalculator.entity.commercialOffice;

import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class commercialOffice extends  item{
        private double carbonNum;
        private double coefficient;
    public double getCarbonNum() {
        return carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }


}
