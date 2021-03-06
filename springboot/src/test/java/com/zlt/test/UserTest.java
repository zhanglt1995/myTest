package com.zlt.test;

import com.zlt.entity.UserEntity;
import com.zlt.service.UserServices;
import com.zlt.vo.UserSubmitVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:48
 * @desc
 */
public class UserTest extends BaseTest {
    @Autowired
    private UserServices userServices;

    @Test
    public void test(){
        List<UserEntity> userEntityList = userServices.findUser();
        System.out.println(userEntityList);
    }

    @Test
    public void add(){
        UserSubmitVO userSubmitVO = new UserSubmitVO();
        userSubmitVO.setUsername("张三");
        userSubmitVO.setPassword("123");

        userServices.add(userSubmitVO);
    }
}
