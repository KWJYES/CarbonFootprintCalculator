package com.example.carbonfootprintcalculator.entity.Electronics;


import com.example.carbonfootprintcalculator.entity.item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Electronics extends item {
    private String itemName;
    private double carbonNum;
    private double coefficient;
    public double getCarbonNum() {
        return carbonNum;
    }



    public Electronics(double carbonNum) {
        this.carbonNum = carbonNum;
    }

    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }


}
