package org.example;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("b.txt"),new File("a.txt"));
        System.out.println(FileUtils.byteCountToDisplaySize(Long.MAX_VALUE));
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.debug("hello");
    }

}