package com.zlt.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhanglitao
 * @create 2020/6/16 20:06
 * @desc
 */
@Data
@ApiModel(value = "CategoryVO", description = "商品分类对象实体")
public class CategoryVO {
    @ApiModelProperty(value = "分类编号",example = "3748")
    private String cid;
    @ApiModelProperty(value = "分类名",example = "手机数码")
    private String cname;
}
