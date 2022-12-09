package com.example.carbonfootprintcalculator.entity.toursimAndvacation;


import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class tourismAndvacation extends item {
    private double carbonNum;
    private double coefficient;
    public double getCarbonNum() {
        return carbonNum;
    }

    public tourismAndvacation(String itemName, double carbonNum) {
        super(itemName);
        this.carbonNum = carbonNum;
    }

    public tourismAndvacation(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }


}
