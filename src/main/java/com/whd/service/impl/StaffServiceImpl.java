package com.whd.service.impl;

import com.whd.dao.StaffMapper;
import com.whd.entity.Staff;
import com.whd.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    // 注入Service依赖
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return staffMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Staff record) {
        return staffMapper.insert(record);
    }

    @Override
    public int insertSelective(Staff record) {
        return 0;
    }

    @Override
    public Staff selectByPrimaryKey(Long id) {
        return selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Staff record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Staff record) {
        return updateByPrimaryKey(record);
    }
}
