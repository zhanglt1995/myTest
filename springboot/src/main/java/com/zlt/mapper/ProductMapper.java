package com.zlt.mapper;

import com.zlt.entity.ProductEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/14 17:12
 * @desc
 */
public interface ProductMapper {
    /**
     * 查找所有产品
     * @return
     */
    List<ProductEntity> findProductByPage(@Param("startIndex") int startIndex, @Param("pageSize")int pageSize);
}
