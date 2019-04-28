package com.whd.service;

import com.whd.entity.Student;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface StudentService {

    Student selectByPrimaryKey(Integer studentId);

    //List<Student> queryAll();

    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int updateByPrimaryKey(Student record);
}

