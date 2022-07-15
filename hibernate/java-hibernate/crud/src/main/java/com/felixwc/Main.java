package com.felixwc;

import com.felixwc.utils.HibernateUtils;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Session session = HibernateUtils.obtainSession();
    }
}