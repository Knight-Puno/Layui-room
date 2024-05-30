package com.example.entity;

public class Student {
    private int sno;    //学号
    private String studentName; //姓名
    private String studentSex; //性别
    private int studentAgo;  //年龄
    private int rno;    //宿舍号
    private int hno;    //宿舍楼号

    public Student() {
    }

    public Student(int sno, String studentName, String studentSex, int studentAgo, int rno, int hno) {
        this.sno = sno;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAgo = studentAgo;
        this.rno = rno;
        this.hno = hno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentAgo=" + studentAgo +
                ", rno=" + rno +
                ", hno=" + hno +
                '}';
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAgo() {
        return studentAgo;
    }

    public void setStudentAgo(int studentAgo) {
        this.studentAgo = studentAgo;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }
}
