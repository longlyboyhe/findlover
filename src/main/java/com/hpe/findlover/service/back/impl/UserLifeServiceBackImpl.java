package com.hpe.findlover.service.back.impl;

import com.hpe.findlover.mapper.UserLifeMapper;
import com.hpe.findlover.model.UserLife;
import com.hpe.findlover.service.BaseServiceImpl;
import com.hpe.findlover.service.back.UserLifeServiceBack;
import com.hpe.util.BaseTkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLifeServiceBackImpl extends BaseServiceImpl<UserLife> implements UserLifeServiceBack {

    private final UserLifeMapper userLifeMapper;

    @Autowired
    public UserLifeServiceBackImpl(UserLifeMapper userLifeMapper) {
        this.userLifeMapper=userLifeMapper;
    }

    @Override
    public BaseTkMapper<UserLife> getMapper() {
        return userLifeMapper;
    }
}
