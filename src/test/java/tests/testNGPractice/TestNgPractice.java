package tests.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgPractice {

    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("Setting up the suite environment.");}
    @BeforeTest
    public static void beforeTest(){
        System.out.println("Configuring test environment.");}
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Loading class resources.");}
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println( "Initializing test method setup.");}
    @Test
    //Write at least three test methods. Each method should perform a simple assertion or print a message.Example Test: Assert that the sum of two integers is correct.
   public void test1(){
        System.out.println("Test 1");
        Assert.assertTrue(5 < 9);
    }


    @AfterMethod
    public static void afterMethod(){
        System.out.println("Cleaning up after test method.");}
    @AfterClass
    public static void afterClass(){
        System.out.println("Releasing class resources.");}
    @AfterTest
    public static void afterTest(){
        System.out.println("Tearing down test environment.");}
    @AfterSuite
    public static void AfterSuite(){
        System.out.println("Cleaning up the suite environment.");}


}
