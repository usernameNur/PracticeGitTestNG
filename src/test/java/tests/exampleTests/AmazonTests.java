package tests.exampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class AmazonTests {
    public void amazon(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
    @BeforeTest (groups={"my"})
    public void amazonTests(){
        System.out.println("This is Amazon");
        SeleniumUtils.waitForSeconds(3);
    }
    @Test (groups={"my"})
    public void login(){
        System.out.println("Amazon Test");
    }
    @Test
    public void login2(){
        System.out.println("Login Amazon");
    }
}
