package com.zlt.test;

import com.alibaba.fastjson.JSON;
import com.zlt.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhanglitao
 * @create 2020/6/16 20:23
 * @desc
 */
public class CategoryTest extends BaseTest {
    @Autowired
    private CategoryService categoryService;
    @Test
    public void findAll(){
        System.out.println(JSON.toJSONString(categoryService.findAll()));
    }
}
