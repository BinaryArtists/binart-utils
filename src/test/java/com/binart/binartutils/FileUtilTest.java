package com.binart.binartutils;

import com.binart.binartutils.utils.FileUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by Administrator on 2019/11/24.
 */
@SpringBootTest
public class FileUtilTest {
    @Test
    public void extension() throws Exception {
        String filename = "abc.xls";
        String validate = FileUtil.extension(filename);
        Assertions.assertEquals("xls", validate);
    }

    @Test
    public void trimExtension() throws Exception {
        String filename = "abc.xls";
        String validate = FileUtil.trimExtension(filename);
        Assertions.assertEquals("abc", validate);
    }

}