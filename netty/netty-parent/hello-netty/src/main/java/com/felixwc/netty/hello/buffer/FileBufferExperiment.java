package com.felixwc.netty.hello.buffer;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * in order to learn java!
 * created at 2021/8/23 21:18
 *
 * @author wangchao
 */
@Slf4j
public class FileBufferExperiment {

    public static void doExperiment1() throws IOException {
        try(FileChannel channel=new FileInputStream("./file/input-test.txt").getChannel()){
            ByteBuffer byteBuffer = ByteBuffer.allocate(10);
            int length =0;
            while (true){
                length= channel.read(byteBuffer);
                if(-1==length) break;
                byteBuffer.flip();
                while(byteBuffer.hasRemaining()){
                    byte b = byteBuffer.get();
                    log.trace("字节："+b);
                }
                byteBuffer.clear();
            }
        }
    }


    public static void doExperiment() {
        log.info("hello fileBufferExperiment");
    }
}
