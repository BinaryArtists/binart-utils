package com.binart.binartutils.utils;

import com.alibaba.fastjson.JSON;

public class SerializeUtil<T> {
    public static <T> byte[] object2bytes (T o) {
        return JSON.toJSONString(o).getBytes();
    }

    public static <T> T bytes2object (byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
