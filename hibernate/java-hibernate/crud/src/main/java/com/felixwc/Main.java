package com.felixwc;

import com.felixwc.utils.HibernateUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HibernateUtils.obtainSession();
    }
}