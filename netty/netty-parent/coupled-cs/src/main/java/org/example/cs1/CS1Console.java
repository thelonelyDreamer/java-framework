package org.example.cs1;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * in order to learn java!
 * created at 2022/10/16 21:36
 *
 * @author felixwc
 */
@Slf4j
public class CS1Console {
    private static int count=1;
    private static final Thread server = new Thread(() -> {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (Exception e) {
            log.debug("server exception:{}",e.getMessage());
        } finally {
        }
    }, "server");

    private static final Thread client = new Thread(() -> {

    }, "client");
    public static synchronized void start() {
        if(count>0){
            server.start();
            client.start();
            count--;
        }
    }

    public static synchronized void stopDemo() {
        if(Objects.nonNull(server)){
            server.interrupt();
        }
        if (Objects.nonNull(client)) {
            client.interrupt();
        }
    }
}
