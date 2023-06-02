package com.myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day18_Assertions {
    @Test
    public void hardAssertion(){
        /*
        Hard assertion will stop if the assertion fails
         */
        System.out.println("starting the test case");
        Assert.assertTrue(true);//pass so continue
        System.out.println("line 15 codes");
        Assert.assertEquals(3,3);//fails so stop and get out of the test mnethod
        System.out.println("line 17 codes");//will now execute
    }
    @Test
    public void softAssertion(){
        /*
        Test case will continue to execute EVEN IF A TEST ASSERTION FAILS
        We must use SoftAssert object to do soft assertion
         */
        System.out.println("starting the test case");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);//pass so continue
        System.out.println("line 28 codes");
        softAssert.assertEquals(3,4);//fails but continue without problem until end of the method
        System.out.println("line 30 codes");
      //  softAssert.assertAll("TEST CASE COMPLETED");//assertAll MUST BE USED AT THE END TO MARK THE TEST CASE AS PASS OR FAIL


    }
}
