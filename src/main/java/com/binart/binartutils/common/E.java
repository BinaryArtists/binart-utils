package com.binart.binartutils.common;

import com.binart.binartutils.pattern.Itemable;

public enum E implements Itemable {
    WARN(-1, "网络异常，请稍后重试"),
    ERROR(500, "失败"),
    SUCCESS(200, "成功"),
    VALIDATE_FAILED(400, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限"),
    ,;
    /// - 实现体
    private Integer code = null;
    private String msg = "";
    private String shorthand = "";
    E(Integer code, String msg) { this.code = code; this.msg = msg; }
    @Override
    public Integer getCode() { return code; }
    @Override
    public String getMsg() { return msg; }
}
