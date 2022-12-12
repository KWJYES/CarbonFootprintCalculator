package com.example.carbonfootprintcalculator.entity.toursimAndvacation;

import com.example.carbonfootprintcalculator.entity.mealsADay.mealsADay;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class hotel extends mealsADay {
    private double carbonNum;
    private String itemName;
    private double coefficient = 0.03;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

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
}
