package com.zlt.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhanglitao
 * @create 2020/6/14 20:38
 * @desc
 */
@Data
public class UserSubmitVO {
    @ApiModelProperty(value = "用户名", example = "张三")
    private String username;
}
