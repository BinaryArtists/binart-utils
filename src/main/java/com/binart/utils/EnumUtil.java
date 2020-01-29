package com.binart.utils;

import java.lang.reflect.Method;

public class EnumUtil {
    /**
     * 以0开始获取枚举类型
     */
    public static <T extends Enum<T>> T indexOf(Class<T> clazz, int ordinal) {
        return clazz.getEnumConstants()[ordinal];
    }

    /**
     * nameOf,传入的参数name指的是枚举值的名称，一般是大写加下划线的
     */
    public static <T extends Enum<T>> T nameOf(Class<T> clazz, String name) {
        return Enum.valueOf(clazz, name);
    }

    /**
     * 使用code<string>获取枚举类型
     */
    public static <T extends Enum<T>> T forCode(Class<T> clazz, String codeGetter, String code) {
        T result = null;
        try {
            result = EnumUtil.forWhat(clazz, codeGetter, code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 使用枚举类型对应的typeCode<integer>获取枚举类型
     */
    public static <T extends Enum<T>> T forCode(Class<T> clazz, String codeGetter, Integer code) {
        T result = null;
        try {
            T[] arr = clazz.getEnumConstants();
            Method targetMethod = clazz.getDeclaredMethod(codeGetter);
            Integer typeCodeVal = null;
            for (T entity:arr) {
                typeCodeVal = Integer.valueOf(targetMethod.invoke(entity).toString());
                if (typeCodeVal.equals(code)) {
                    result = entity;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 使用枚举类型对应的typeName获取枚举类型
     */
    public static <T extends Enum<T>> T forName(Class<T> clazz, String nameGetter, String name) {
        T result = null;
        try {
            result = EnumUtil.forWhat(clazz, nameGetter, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private static <T extends Enum<T>> T forWhat(Class<T> clazz, String nameGetter, String name) throws Exception {
        T result = null;
        T[] arr = clazz.getEnumConstants();
        Method targetMethod = clazz.getDeclaredMethod(nameGetter);
        String typeNameVal = null;
        for (T entity:arr) {
            typeNameVal = targetMethod.invoke(entity).toString();
            if (typeNameVal.contentEquals(name)) {
                result = entity;
                break;
            }
        }

        return result;
    }
}
