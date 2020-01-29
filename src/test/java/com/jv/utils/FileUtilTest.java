package com.jv.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/11/24.
 */
public class FileUtilTest {
    @Test
    public void extension() throws Exception {
        String filename = "abc.xls";
        String validate = FileUtil.extension(filename);
        Assert.assertEquals("xls", validate);
    }

    @Test
    public void trimExtension() throws Exception {
        String filename = "abc.xls";
        String validate = FileUtil.trimExtension(filename);
        Assert.assertEquals("abc", validate);
    }

}