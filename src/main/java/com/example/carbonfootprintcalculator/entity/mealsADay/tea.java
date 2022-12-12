package com.example.carbonfootprintcalculator.entity.mealsADay;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class tea extends mealsADay {
    private double carbonNum;
    private String itemName;
    private double coefficient = 0.05;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
