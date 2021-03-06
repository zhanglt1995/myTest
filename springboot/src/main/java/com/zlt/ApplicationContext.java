package com.zlt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhanglitao
 * @create 2020/6/1 19:51
 * @desc
 */
@SpringBootApplication
@MapperScan("com.zlt.mapper")
public class ApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class);
    }
}
