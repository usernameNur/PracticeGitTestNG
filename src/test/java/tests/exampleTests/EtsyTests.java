package tests.exampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class EtsyTests {
    public void Etsy(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");
    }
    @BeforeTest
    public void EtsyTests(){
        System.out.println("This is Etsy");
        SeleniumUtils.waitForSeconds(3);
    }
    @Test (groups={"my"})
    public void login(){
        System.out.println("Etsy Test");
    }
    @Test
    public void login2(){
        System.out.println("Login Etsy");
    }
}

