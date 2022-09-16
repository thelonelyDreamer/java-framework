package org.example.collection4;

import org.apache.commons.collections4.MapUtils;
import org.junit.Test;

import java.util.TreeMap;

/**
 * in order to learn java!
 * created at 2022/9/14 10:54
 *
 * @author felixwc
 */
public class MapUtilsTest {

    @Test
    public void test(){
        TreeMap<String, String> map = new TreeMap<>();
        System.out.println(MapUtils.isEmpty(map));
        System.out.println(MapUtils.isNotEmpty(map));

    }
}
