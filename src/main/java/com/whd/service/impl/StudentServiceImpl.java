package com.whd.service.impl;

import com.whd.dao.StudentMapper;
import com.whd.entity.Student;
import com.whd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    // 注入Service依赖
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectByPrimaryKey(Integer studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    /*@Override
    public List<Student> queryAll() {
        return studentMapper.queryAll();
    }*/

    @Override
    public int insert(Student record){
        return studentMapper.insert(record) ;}

    @Override
    public int deleteByPrimaryKey(Integer studentId){return studentMapper.deleteByPrimaryKey(studentId);}

    @Override
    public int updateByPrimaryKey(Student record){return studentMapper.updateByPrimaryKey(record);}

}
