package com.whd.service.impl;

import com.whd.dao.CourseMapper;
import com.whd.entity.Course;
import com.whd.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course selectByPrimaryKey(Integer courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public int deleteByPrimaryKey(Integer courseId) {
        return courseMapper.deleteByPrimaryKey(courseId);
    }

    @Override
    public int insert(Course record) {
        return courseMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }
}
