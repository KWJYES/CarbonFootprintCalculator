package com.example.carbonfootprintcalculator.entity.transportion;


import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class transSportion extends item {
    private double carbonNum;
    private double coefficient;
    public double getCarbonNum() {
        return carbonNum;
    }

    public transSportion(String itemName, double carbonNum) {
        super(itemName);
        this.carbonNum = carbonNum;
    }

    public transSportion(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }


}
