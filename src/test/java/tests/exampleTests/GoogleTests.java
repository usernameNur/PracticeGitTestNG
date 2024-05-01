package tests.exampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class GoogleTests {
    public void google(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @BeforeGroups (groups={"my"})
    public void googleTests(){
        System.out.println("This is Before Group Google");
        SeleniumUtils.waitForSeconds(3);
    }
    @Test
    public void login(){
        System.out.println("Google Test");
    }
    @Test (groups={"my"})
    public void login2(){
        System.out.println("Login Google");
    }

}
