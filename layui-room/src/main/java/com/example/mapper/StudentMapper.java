package com.example.mapper;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 数据库中student表的映射
 */
@Mapper
public interface StudentMapper {
    /**
     * 插入学生信息
     * @param student
     */
    void addStu(Student student);

    /**
     * 多条件查询学生
     * @return
    */
    List<Student> getStuByParams(@Param("sno") Integer sno,
                                 @Param("studentName") String studentName, //姓名
                                 @Param("studentSex") String studentSex, //性别
                                 @Param("studentAgo") String studentAgo,  //年龄
                                 @Param("rno") int rno,    //宿舍号
                                 @Param("hno") int hno    //宿舍楼号

    );

    /**
     * 按学号删除学生
     */
    void deleteBySno(int sno);

    /**
     * 批量删除学生
     */
    void batchDel(List<Integer> snos);

    /**
     * 更新学生信息
     */
    void updateStu(Student student);
}
