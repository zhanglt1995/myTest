package com.zlt.exception;

import com.zlt.bean.CodeMsgBean;
import lombok.Data;

/**
 * @author ruanzhi
 * @create 2019-11-30 17:31
 * @desc
 */
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 194906846739586856L;

    private CodeMsgBean codeMsgBean;

    public BusinessException() {
        super();
    }

    public BusinessException(CodeMsgBean codeMsgBean) {
        super(codeMsgBean.getMsg());
        this.codeMsgBean = codeMsgBean;
    }


}