package com.example.carbonfootprintcalculator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.carbonfootprintcalculator.mapper")
public class CarbonFootprintCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarbonFootprintCalculatorApplication.class, args);
    }

}
