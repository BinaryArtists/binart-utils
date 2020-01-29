package com.binart.utils;

import java.util.Collections;
import java.util.List;

public class ListUtil {

    public static void reverse (List list) {
        Collections.reverse(list);
    }

    public static <T> T last (List<T> list) {
        if (list == null || list.size() == 0) return null;

        return list.get(list.size()-1);
    }

    public static <T> T first (List<T> list) {
        if (list == null || list.size() == 0) return null;

        return list.get(0);
    }
}
