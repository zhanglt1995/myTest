package com.zlt.service;

import com.zlt.entity.ProductEntity;
import com.zlt.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/15 11:18
 * @desc
 */
@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<ProductEntity> findProductByPage(int currentPage, int pageSize) {
        List<ProductEntity> productEntityList = productMapper.findProductByPage((currentPage - 1) * pageSize, pageSize);
        return productEntityList;
    }
}
