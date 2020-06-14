package com.zlt.entity;

import lombok.Data;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:20
 * @desc  用户实体类
 */
@Data
public class UserEntity {
    private String uid;//用户id
    private String username;
    private String password;
    private String name;
    private String email;
    private String birthday;
    private String gender;
    private Integer state;//激活状态  0未激活 1已激活
    private String code;//激活码
    private String remark;//扩展字段
}
