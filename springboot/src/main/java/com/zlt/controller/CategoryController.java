package com.zlt.controller;

import com.zlt.service.CategoryService;
import com.zlt.vo.CategoryVO;
import com.zlt.vo.ResultPageVO;
import com.zlt.vo.ResultVO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/16 20:00
 * @desc 分类的controller
 */
@Controller
@RequestMapping("/category")
@Api(value = "CategoryController", description = "商品分类相关操作api入口", tags = "商品分类模块")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "查询商品分类", notes = "查询商品分类")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数不合法", response = ResultVO.class),
            @ApiResponse(code = 500, message = "服务端错误", response = ResultVO.class)
    })
    @ResponseBody
    public ResultPageVO<CategoryVO> findAll(){
        List<CategoryVO> categoryVOList = categoryService.findAll();
        return ResultPageVO.success(categoryVOList);
    }
}
