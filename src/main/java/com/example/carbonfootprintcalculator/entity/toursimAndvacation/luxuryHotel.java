package com.example.carbonfootprintcalculator.entity.toursimAndvacation;

import com.example.carbonfootprintcalculator.entity.toursimAndvacation.tourismAndvacation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class luxuryHotel extends tourismAndvacation {
    private double carbonNum;
    private double coefficient = 0.05;;
    public void setCarbonNum(int num) {
        this.carbonNum = num*coefficient;
    }

}
