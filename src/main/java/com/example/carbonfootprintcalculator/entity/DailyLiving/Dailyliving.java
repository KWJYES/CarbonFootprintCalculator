package com.example.carbonfootprintcalculator.entity.DailyLiving;


import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Dailyliving extends item {
    private double carbonNum;
    private double coefficient;
    public double getCarbonNum() {
        return carbonNum;
    }

    public Dailyliving(String itemName, double carbonNum) {
        super(itemName);
        this.carbonNum = carbonNum;
    }

    public Dailyliving(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }


}
