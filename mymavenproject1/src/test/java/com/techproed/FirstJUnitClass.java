package com.techproed;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnitClass {
    // Create a method name: setUp
    // Print: This is before method
    // THIS IS NOT A TEST CASE
    // BECAUSE WE DO NOT HAVE @Test annotation
    @Before
    public void setUp(){
        System.out.println("This is before method. This runs before each @Test annotation");
    }

    // Create our first method
    // @Test is used to CREATE TEST CASES
    // with @Test, we no longer need a main method
    @Test
    public void test1(){
        System.out.println("This is my first test case");
    }

    // Skipping this test case @Ignore annotation
    @Ignore
    @Test
    public void test2(){
        System.out.println("This is my second test case");
    }

    // Create another test case: test3
    @Test
    public void test3(){
        System.out.println("This is my third test case");
    }

    @After
    public void tearDown(){
        System.out.println("This is my after method. This runs after each @Test annotation");
    }

}
