package com.zlt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanglitao
 * @create 2019-11-13 09:14
 * @desc
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zlt.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalResponseMessage(RequestMethod.GET,
                        newArrayList(new ResponseMessageBuilder()
                                        .code(500)
                                        .message("系统繁忙！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(400)
                                        .message("你没有登录！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(200)
                                        .message("请求成功!")
                                        .build()))
                .globalResponseMessage(RequestMethod.POST,
                        newArrayList(new ResponseMessageBuilder()
                                        .code(500)
                                        .message("系统繁忙！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(400)
                                        .message("请先登录！")
                                        .build(),
                                new ResponseMessageBuilder()
                                        .code(200)
                                        .message("请求成功!")
                                        .build()))
                ;
    }

    private List<ResponseMessage> newArrayList(ResponseMessage... responseMessages) {
        List<ResponseMessage> responseMessageList = new ArrayList<>();
        for (ResponseMessage responseMessage : responseMessages) {
            responseMessageList.add(responseMessage);
        }
        return responseMessageList;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("购物网站的api文档")
                .description("购物网站的api文档")
                .contact(new Contact("Z","",""))
                .version("1.0")
                .build();
    }
}
