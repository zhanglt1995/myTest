package com.zlt.test;

import com.alibaba.fastjson.JSON;
import com.zlt.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhanglitao
 * @create 2020/6/15 11:32
 * @desc
 */
public class ProductTest extends BaseTest {
    @Autowired
    private ProductService productService;
    @Test
    public void findProdect(){
        System.out.println(JSON.toJSONString(productService.findProductByPage(1,2)));
    }
}
