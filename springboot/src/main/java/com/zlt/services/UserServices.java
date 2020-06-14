package com.zlt.services;

import com.zlt.entity.UserEntity;
import com.zlt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:33
 * @desc
 */
@Service
public class UserServices {

    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> findUser(){
        List<UserEntity> userEntityList = userMapper.findUser();
        UserEntity entity = new UserEntity();
        return userEntityList;
    }
}
