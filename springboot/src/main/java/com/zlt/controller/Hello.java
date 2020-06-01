package com.zlt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanglitao
 * @create 2020/6/1 20:01
 * @desc
 */
@RestController
@RequestMapping("/test")
public class Hello {
    @RequestMapping("/hello")
    public Map testHello(){
        Map<String,String> map = new HashMap();
        map.put("Hello","World");
        return map;
    }
}
