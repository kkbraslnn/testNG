package com.myapp.tests.topics;

import org.testng.annotations.*;

public class Day17_Annotations {

    /*
    @Test: Creates a test case ,marks a method as a test case.In this class there are 5 test cases.
    same as JUNIT @Before and @After : there are 5 before 5 after annotations
    hyararshi: suite > test > group > class > method
    @Ignore : skip or ignore test cases.ex:ignore test3
    @Test(enable=false):disable the test case.by default ,enable=true.ex:disable test 4
    @Test(priority = priority number): TestNG runs inn alphabetical order by default . use priority to prioritize the test cases.
    best practice: when you use priority, then use priority for all of the test cases, and give different numbers.


     */


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("before groups");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("after groups");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("after method");
    }


    @Test(priority = -3)
    public void test1(){System.out.println(" Test 1 ");}
    @Test(priority = 1)
    public void test2(){System.out.println(" Test 2 ");}
    @Test @Ignore
    public void test3(){System.out.println(" Test 3 ");}
    @Test(enabled = false)
    public void test4(){System.out.println(" Test 4 ");}
    @Test(priority = 2)
    public void test5(){
        System.out.println(" Test 5 ");}

    @Test
    public void test6(){
        System.out.println("test 6");
    }
}
