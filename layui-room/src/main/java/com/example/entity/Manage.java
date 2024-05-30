package com.example.entity;

public class Manage {
    private int mno;
    private String manageName;
    private String manageSex;
    private int manageAgo;
    private int hno;

    @Override
    public String toString() {
        return "Manage{" +
                "mno=" + mno +
                ", manageName='" + manageName + '\'' +
                ", manageSex='" + manageSex + '\'' +
                ", manageAgo=" + manageAgo +
                ", hno=" + hno +
                '}';
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    public String getManageSex() {
        return manageSex;
    }

    public void setManageSex(String manageSex) {
        this.manageSex = manageSex;
    }

    public int getManageAgo() {
        return manageAgo;
    }

    public void setManageAgo(int manageAgo) {
        this.manageAgo = manageAgo;
    }

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }
}
