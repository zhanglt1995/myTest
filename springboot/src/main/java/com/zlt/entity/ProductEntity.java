package com.zlt.entity;

import lombok.Data;

/**
 * @author zhanglitao
 * @create 2020/6/15 11:18
 * @desc
 */
@Data
public class ProductEntity {
    private String pid;//id
    private String pname;//名字
    private Double market_price;//市场价

    private Double shop_price;//商城价
    private String pimage;//图片
    private String pdate;//日期

    private Integer is_hot;  //是否热门  1:热门    0:不热门
    private String pdesc;//描述
    private Integer pflag;	//是否下架    1:下架	0:未下架
    private String cid;
}
