package com.zlt.exception;

import com.zlt.bean.CodeMsgBean;
import lombok.Data;

/**
 * @author ruanzhi
 * @create 2019-11-30 17:31
 * @desc
 */
@Data
public class BusinessPageException extends RuntimeException {


    private static final long serialVersionUID = -6695234397744955707L;
    private CodeMsgBean codeMsgBean;

    public BusinessPageException() {
        super();
    }


    public BusinessPageException(CodeMsgBean codeMsgBean) {
        super(codeMsgBean.getMsg());
        this.codeMsgBean = codeMsgBean;
    }


}