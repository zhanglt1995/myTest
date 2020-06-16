package com.zlt.mapper;

import com.zlt.entity.CategoryEntity;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:11
 * @desc
 */
public interface CategoryMapper {
    /**
     * 获取所有商品分类
     * @return
     */
    List<CategoryEntity> findAll();
}
