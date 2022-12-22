package com.example.carbonfootprintcalculator.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private double carbonNum;
    private Date date;
    private String uname;
    private int treeNum;

    public Date getDate() {
        return date;
    }

    public int getTreeNum() {
        return treeNum;
    }

    public void setTreeNum(int treeNum) {
        this.treeNum = treeNum;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getCarbonNum() {
        return carbonNum;
    }

    public void setCarbonNum(double carbonNum) {
        this.carbonNum = carbonNum;
    }
    public void toTree()
    {
        if (carbonNum%111 ==0)
             treeNum = (int) (this.carbonNum/111);

        else
            treeNum = (int) (this.carbonNum/111)+1;
    }

}
