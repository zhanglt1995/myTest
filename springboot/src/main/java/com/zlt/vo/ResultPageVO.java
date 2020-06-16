package com.zlt.vo;

import com.zlt.bean.CodeMsgBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author ruanzhi
 * @create 2019-12-01 19:54
 * @desc
 */
@Data
public class ResultPageVO<T> {
    @ApiModelProperty(value = "code码", example = "3748")
    private int code;
    @ApiModelProperty(value = "对应msg", example = "成功")
    private String msg;
    @ApiModelProperty(value = "当前页数", example = "1")
    private Integer page;
    @ApiModelProperty(value = "当前获取数据大小", example = "1")
    private Integer pageSize;
    @ApiModelProperty(value = "查询出来的总记录数", example = "12")
    private Integer totalCount;
    @ApiModelProperty(value = "对应的数据")
    private List<T> data;

    /**
     * 成功时候的调用
     */
    public static <T> ResultPageVO<T> success(List<T> data, Integer page, Integer pageSize) {
        return new ResultPageVO<T>(data, page, pageSize);
    }

    public static <T> ResultPageVO<T> success(List<T> data) {
        return new ResultPageVO<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> ResultPageVO<T> error(CodeMsgBean cm) {
        return new ResultPageVO<T>(cm);
    }

    private ResultPageVO(List<T> data, Integer page, Integer pageSize) {
        this.code = 200;
        this.msg = "success";
        this.page = page;
        this.pageSize = pageSize;
        this.data = data;
    }

    private ResultPageVO(List<T> data){
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    private ResultPageVO(CodeMsgBean cm) {
        if (cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

}
