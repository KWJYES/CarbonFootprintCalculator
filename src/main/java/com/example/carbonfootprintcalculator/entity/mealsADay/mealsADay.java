package com.example.carbonfootprintcalculator.entity.mealsADay;


import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class mealsADay extends item {
    private double carbonNum;
    private double coefficient;
    public double getCarbonNum() {
        return carbonNum;
    }

    public mealsADay(String itemName, double carbonNum) {
        super(itemName);
        this.carbonNum = carbonNum;
    }

    public mealsADay(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }


}
