package org.example.collection4;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/9/14 10:58
 *
 * @author felixwc
 */
public class CollectionUtilsTest {

    @Test
    public void test(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        add(list1,"a","b","c","1");
        add(list2,"1","2","3","c");
        System.out.println(CollectionUtils.intersection(list1,list2));
        System.out.println(CollectionUtils.disjunction(list1,list2));
    }

    public static <T> void add(List<T> list, T... element){
        for (T t : element) {
            list.add(t);
        }
    }
}
