package com.whd.service;

import com.whd.entity.Student;
import com.whd.entity.Teacher;

public interface TeacherService {

    Teacher selectByPrimaryKey(Integer teacherId);

    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int updateByPrimaryKey(Teacher record);
}
