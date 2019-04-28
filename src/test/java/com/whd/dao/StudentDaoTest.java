package com.whd.dao;

import java.util.List;

import com.whd.entity.Sign;
import com.whd.entity.Student;
import com.whd.service.SignService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.whd.BaseTest;

public class StudentDaoTest extends BaseTest {

    @Autowired
    private StudentMapper studentDao;

    @Autowired
    private SignService signService;

    @Test
    public void testQueryById() throws Exception {
        int studentId = 1;
        Student student = studentDao.selectByPrimaryKey(studentId);
        System.out.println(student);
    }

    @Test
    public void testQueryAll() throws Exception {
    /*    *//*List<Student> students = studentDao.queryAll();
        for (Student student : students) {
            System.out.println(students);*//*
        }*/
    }

  /*  @Test
    public void add(Sign record){
        signService.insert(record);
    }*/

}
