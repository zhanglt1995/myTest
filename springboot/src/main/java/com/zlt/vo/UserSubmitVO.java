package com.zlt.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhanglitao
 * @create 2020/6/14 20:38
 * @desc
 */
@Data
@ApiModel(value = "UserSubmitVO", description = "用户注册提交实体")
public class UserSubmitVO {
    @ApiModelProperty(value = "用户名", example = "张三")
    private String username;
    @ApiModelProperty(value = "密码", example = "123456")
    private String password;
  /*  @ApiModelProperty(value = "邮箱", example = "123456")
    private String email;
    @ApiModelProperty(value = "密码", example = "123456")
    private String name;
    @ApiModelProperty(value = "密码", example = "123456")
    private String sex;
    @ApiModelProperty(value = "密码", example = "123456")
    private String birthday;*/
}
