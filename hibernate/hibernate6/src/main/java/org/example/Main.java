package org.example;



import jdk.internal.instrumentation.Logger;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        System.out.println("hellaf发士大夫o");

        Logger logger = null;
        ServiceLoader<Logger> load = ServiceLoader.load(Logger.class);
        System.out.println(load);
        Iterator<Logger> iterator = load.iterator();
        if(iterator.hasNext()){
            System.out.println("a");
            logger=iterator.next();
        }

    }
}