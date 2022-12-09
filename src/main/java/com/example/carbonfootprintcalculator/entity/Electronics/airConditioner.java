package com.example.carbonfootprintcalculator.entity.Electronics;

import com.example.carbonfootprintcalculator.entity.Electronics.Electronics;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class airConditioner extends Electronics {
    private double carbonNum;
    private double coefficient = 0.10;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
