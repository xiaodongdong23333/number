package com.whd.service.impl;

import com.whd.dao.TeacherMapper;
import com.whd.entity.Teacher;
import com.whd.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher selectByPrimaryKey(Integer teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public int deleteByPrimaryKey(Integer teacherId) {
        return teacherMapper.deleteByPrimaryKey(teacherId);
    }

    @Override
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }


}
