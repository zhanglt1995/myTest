package com.zlt.vo;

import com.zlt.bean.CodeMsgBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author zhanglitao
 * @create 2020/6/14 20:27
 * @desc
 */
@ApiModel(value = "ResultVO", description = "统一返回对象实体")
public class ResultVO<T> {
    @ApiModelProperty(value = "code码",example = "3748")
    private int code;
    @ApiModelProperty(value = "对应msg", example = "成功")
    private String msg;
    @ApiModelProperty(value = "对应的数据")
    private T data;

    /**
     * 成功时候的调用
     */
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> ResultVO<T> error(CodeMsgBean cm) {
        return new ResultVO<T>(cm);
    }

    private ResultVO(T data) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    private ResultVO(CodeMsgBean cm) {
        if (cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
