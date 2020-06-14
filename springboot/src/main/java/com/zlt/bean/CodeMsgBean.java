package com.zlt.bean;

/**
 * @author zhanglitao
 * @create 2020/6/14 20:29
 * @desc
 */
public class CodeMsgBean {
    private int code;
    private String msg;

    //通用的错误码
    public static CodeMsgBean SUCCESS = new CodeMsgBean(200, "success");
    public static CodeMsgBean SERVER_ERROR = new CodeMsgBean(500, "服务端异常");
    public static CodeMsgBean FORMAT_ERROR = new CodeMsgBean(401, "参数格式不合法");
    public static CodeMsgBean REQUEST_ILLEGAL = new CodeMsgBean(400, "信息填写不完整");
    //登录模块
    public static CodeMsgBean USER_NOT_LOGGED_IN = new CodeMsgBean(401, "您还没有登录，请先登录");
    public static CodeMsgBean LOGIN_ERROR = new CodeMsgBean(402, "用户名或者密码错误");

    //数据添加部分
    public static CodeMsgBean USER_RESULTS = new CodeMsgBean(403, "输入的用户id无效");
    public static CodeMsgBean LABEL_RESULTS = new CodeMsgBean(403, "输入的标签名称无效");

    private CodeMsgBean() {
    }

    public CodeMsgBean(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CodeMsgBean fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsgBean(code, message);
    }

    @Override
    public String toString() {
        return "CodeMsgBean [code=" + code + ", msg=" + msg + "]";
    }
}
