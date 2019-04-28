package com.whd.service;

import com.whd.entity.Sign;
import com.whd.entity.SignKey;

public interface SignService {

    Sign selectByPrimaryKey(SignKey key);

    int deleteByPrimaryKey(SignKey key);

    int insert(Sign record);

    int updateByPrimaryKey(Sign record);
}
