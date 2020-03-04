package com.binart.binartutils.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R <T> implements Serializable {
    private static final long serialVersionUID = -2223533973355034183L;
    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    private Integer code;
    private String msg;
    private T result;

    public static R ok() {
        return new R(0, SUCCESS, null);
    }
    public static <T> R ok(T payload) {
        return new R(0, SUCCESS, payload);
    }

    public static R err (Integer code) {
        return new R(code, ERROR, null);
    }
    public static R err(Integer code, String msg) {
        return new R(code, msg, null);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
