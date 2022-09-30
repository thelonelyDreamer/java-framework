package org.example;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String utf8 = new String("sdf".getBytes(), "utf8");
        System.out.println(utf8);
    }
}