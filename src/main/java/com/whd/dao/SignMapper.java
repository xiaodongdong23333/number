package com.whd.dao;

import com.whd.entity.Sign;
import com.whd.entity.SignKey;

public interface SignMapper {
    int deleteByPrimaryKey(SignKey key);

    int insert(Sign record);

    int insertSelective(Sign record);

    Sign selectByPrimaryKey(SignKey key);

    int updateByPrimaryKeySelective(Sign record);

    int updateByPrimaryKey(Sign record);
}