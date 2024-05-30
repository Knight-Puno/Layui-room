package com.example.entity;

public class House {
    private int hno;    //楼号
    private String houseName;   //楼名
    private int houseScale; //楼规模

    @Override
    public String toString() {
        return "House{" +
                "hno=" + hno +
                ", houseName='" + houseName + '\'' +
                ", houseScale=" + houseScale +
                '}';
    }

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getHouseScale() {
        return houseScale;
    }

    public void setHouseScale(int houseScale) {
        this.houseScale = houseScale;
    }
}
