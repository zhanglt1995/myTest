package com.zlt.controller;

import com.zlt.service.ProductService;
import com.zlt.vo.ProductVO;
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
 * @create 2020/6/15 11:06
 * @desc
 */
@Controller
@Api(value = "ProductController", description = "商品相关操作api入口", tags = "商品模块")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "分页查询商品详情",notes = "分页查询商品详情")
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数不合法", response = ResultVO.class),
            @ApiResponse(code = 500, message = "服务器异常", response = ResultVO.class)
    })
    @RequestMapping(value = "/findProductByPage", method = RequestMethod.GET)
    @ResponseBody
    public ResultPageVO<ProductVO> findByPage(@ApiParam(name = "currentPage", value = "当前页数", required = true) Integer currentPage,
                                              @ApiParam(name = "pageSize", value = "每页的数量", required = true) Integer pageSize){
        List<ProductVO> productVOList = productService.findProductByPage(currentPage,pageSize);
        return ResultPageVO.success(productVOList,currentPage,pageSize);
    }
}
