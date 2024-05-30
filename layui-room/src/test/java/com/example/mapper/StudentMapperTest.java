package com.example.mapper;

import com.example.LayuiRoomApplicationTests;
import com.example.entity.Student;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest extends LayuiRoomApplicationTests {
    @Resource
    StudentMapper studentMapper;

    @Test
    void addStu() {
        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.setSno(i+20211100);
            student.setStudentName("测试样例"+i);; //姓名
            if(i%2==0){
                student.setStudentSex("Male");
            }else{
                student.setStudentSex("Female");
            }
            student.setStudentAgo(18+i/2);
            student.setRno(i);
            student.setHno(2);
            System.out.println(studentMapper);
            studentMapper.addStu(student);
        }
    }

    @Test
    void getStuByParams() {
    }

    @Test
    void deleteBySno() {

    }

    @Test
    void batchDel() {
    }

    @Test
    void updateStu() {
    }
}