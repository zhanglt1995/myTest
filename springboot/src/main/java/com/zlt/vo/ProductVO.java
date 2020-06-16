package com.zlt.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhanglitao
 * @create 2020/6/16 21:01
 * @desc
 */
@ApiModel
@Data
public class ProductVO {
    @ApiModelProperty(value = "商品id",example = "3748")
    private String pid;//id
    @ApiModelProperty(value = "商品名字",example = "手机")
    private String pname;//名字
    @ApiModelProperty(value = "市场价",example = "1998.0")
    private Double market_price;//市场价
    @ApiModelProperty(value = "商城价",example = "3748.0")
    private Double shop_price;//商城价
    @ApiModelProperty(value = "图片",example = "/pic/jdfd.jpg")
    private String pimage;//图片
    @ApiModelProperty(value = "日期",example = "2020-03-05")
    private String pdate;//日期
    @ApiModelProperty(value = "是否热门",example = "0")
    private Integer is_hot;  //是否热门  1:热门    0:不热门
    @ApiModelProperty(value = "商品描述",example = "这个是用来打电话的")
    private String pdesc;//描述
    @ApiModelProperty(value = "是否下架",example = "0")
    private Integer pflag;	//是否下架    1:下架	0:未下架
    @ApiModelProperty(value = "分类id",example = "3748")
    private String cid;
}
