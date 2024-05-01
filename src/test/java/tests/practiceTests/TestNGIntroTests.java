package tests.practiceTests;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntroTests {
   @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("This is before Test method");
    }

    @AfterTest
    public static void AfterTestMethod(){
        System.out.println("This is After Test method");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test (groups={"sanity"})
    public void test1(){
        System.out.println("Test 1");
        Assert.assertTrue(5>2);
    }

    @Test (groups={"sanity"})
    public void test2(){
        Assert.assertFalse(2>5);
        System.out.println("Test 2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }
    @Test
    public void test4(){
        System.out.println("Test4");
    }
    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("Before Suite Method");
    }
    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("After Suite Method");
    }


}
