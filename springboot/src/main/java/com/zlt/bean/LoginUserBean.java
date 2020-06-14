package com.zlt.bean;

import lombok.Data;

/**
 * @author ruanzhi
 * @create 2019-11-30 17:11
 * @desc 承接登录用户的bean
 */
@Data
public class LoginUserBean {

    /**
     * 数据库里面的主键id
     */
    private Integer id;

    /**
     * 加密之后的用户的openId+sessionKey
     */
    private String secretUserLoginStr;

    public LoginUserBean() {
    }

    public LoginUserBean(Integer id, String secretUserLoginStr) {
        this.id = id;
        this.secretUserLoginStr = secretUserLoginStr;
    }
}
