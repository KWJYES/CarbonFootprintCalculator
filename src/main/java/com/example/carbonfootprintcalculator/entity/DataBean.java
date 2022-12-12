package com.example.carbonfootprintcalculator.entity;

import java.util.List;

public class DataBean {
    public Integer getUid() {
        return uid;
    }

    private Integer uid;

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public List<data> getDataBeanList() {
        return dataBeanList;
    }

    public void setDataBeanList(List<data> dataBeanList) {
        this.dataBeanList = dataBeanList;
    }

    private List<data> dataBeanList;
    public class data{
        private double Num;
        private String name;

        public double getNum() {
            return Num;
        }

        public void setNum(double num) {
            Num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
