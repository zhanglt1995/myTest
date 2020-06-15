package com.zlt.controller;

import com.zlt.service.UserServices;
import com.zlt.vo.ResultVO;
import com.zlt.vo.UserSubmitVO;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhanglitao
 * @create 2020/6/14 20:18
 * @desc
 */
@Controller
@RequestMapping("/user")
@Api(value = "UserController", description = "用户相关操作api入口", tags = "用户模块")
public class UserController {

    @Autowired
    private UserServices userServices;

    @ApiOperation(value = "注册用户", notes = "注册用户")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数不合法", response = ResultVO.class),
            @ApiResponse(code = 500, message = "服务端错误", response = ResultVO.class)
    })
    @ResponseBody
    public ResultVO<Void> findAdsInFive(@RequestBody @ApiParam(name = "userSubmitVO", value = "用户注册提交实体", required = true) UserSubmitVO userSubmitVO) {
        userServices.add(userSubmitVO);
        return ResultVO.success(null);
    }
}
