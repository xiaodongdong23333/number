package com.whd.service.impl;

import com.whd.dao.SignMapper;
import com.whd.entity.Sign;
import com.whd.entity.SignKey;
import com.whd.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.whd.Utiles.Time.getCurrentTimeStr;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignMapper signMapper;

    @Override
    public Sign selectByPrimaryKey(SignKey key) {
        return signMapper.selectByPrimaryKey(key);

    }

    @Override
    public int deleteByPrimaryKey(SignKey key) {
        return signMapper.deleteByPrimaryKey(key);
    }



    @Override
    public int insert(Sign record) {
        if(record.getCheckIn() == null){
            record.setCheckIn(getCurrentTimeStr());
        }

        return signMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Sign record) {
        if(record.getCheckOut() == null){
            record.setCheckOut(getCurrentTimeStr());
        }
        return signMapper.updateByPrimaryKey(record);
    }
}
