package com.example.carbonfootprintcalculator.entity.DailyLiving;

import com.example.carbonfootprintcalculator.entity.Electronics.Electronics;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class washingMachine extends Electronics {
    private double carbonNum;
    private String itemName;

    @Override
    public double getCarbonNum() {
        return carbonNum;
    }

    @Override
    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private double coefficient = 0.17;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
