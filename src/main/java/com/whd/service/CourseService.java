package com.whd.service;

import com.whd.entity.Course;

public interface CourseService {

    Course selectByPrimaryKey(Integer courseId);

    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    int updateByPrimaryKey(Course record);
}
