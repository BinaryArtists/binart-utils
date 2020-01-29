package com.binart.utils;

public class FileUtil {
    /**
     * 获取文件名的扩展名
     * @param filename
     * @return
     */
    public static String extension(String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int dot = filename.lastIndexOf('.');
            if ((dot >-1) && (dot < (filename.length() - 1))) {
                return filename.substring(dot + 1);
            }
        }
        return filename;
    }

    /**
     * 获取文件名裁去扩展名后的名字
     * @param filename
     * @return
     */
    public static String trimExtension (String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int dot = filename.lastIndexOf('.');
            if ((dot >-1) && (dot < (filename.length()))) {
                return filename.substring(0, dot);
            }
        }
        return filename;
    }
}
