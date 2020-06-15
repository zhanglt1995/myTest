package com.zlt.service;

import com.alibaba.fastjson.JSON;
import com.zlt.bean.CodeMsgBean;
import com.zlt.entity.UserEntity;
import com.zlt.exception.BusinessException;
import com.zlt.mapper.UserMapper;
import com.zlt.util.UUIDUtils;
import com.zlt.vo.UserSubmitVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:33
 * @desc
 */
@Service
@Slf4j
public class UserServices {

    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> findUser(){
        List<UserEntity> userEntityList = userMapper.findUser();
        UserEntity entity = new UserEntity();
        return userEntityList;
    }

    /**
     * 注册用户
     * @param userSubmitVO
     */
    public void add(UserSubmitVO userSubmitVO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUid(UUIDUtils.getUUID());
        userEntity.setUsername(userSubmitVO.getUsername());
        userEntity.setPassword(userSubmitVO.getPassword());
        try {
            userMapper.add(userEntity);
            return;
        }catch (Exception e){
            log.error("userMapper.add is exception userSubmitVO = %s", JSON.toJSONString(userSubmitVO),e);
        }
        throw new BusinessException(CodeMsgBean.SERVER_ERROR);
    }
}
