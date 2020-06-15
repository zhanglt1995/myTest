package com.zlt.mapper;

import com.zlt.entity.UserEntity;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:13
 * @desc
 */
public interface UserMapper {
    /**
     * 查找用户
     * @return
     */
    List<UserEntity> findUser();

    /**
     * 注册用户
     * @param userEntity
     */
    void add(UserEntity userEntity);
}
