package org.example.lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/9/14 10:46
 *
 * @author felixwc
 */
public class ArrayUtilsTest {
    @Test
    public void test(){
        // 判断数组是否为null及长度是否为0
        Integer[] integers = new Integer[1];
        System.out.println(ArrayUtils.isEmpty(integers));
        Integer[] add = ArrayUtils.add(integers, 7);
        Arrays.stream(add).forEach(System.out::println);
        Arrays.stream(add).distinct().forEach(System.out::println);
    }
}
