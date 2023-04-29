package org.example.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KVTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("setup");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("teardown");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void testMain() {
        System.out.println("maintest");
    }
}