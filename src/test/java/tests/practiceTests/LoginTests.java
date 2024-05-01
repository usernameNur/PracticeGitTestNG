package tests.practiceTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;

public class LoginTests {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void before() {
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage();
    }


    @Test(groups = {"login"})
    public void testSuccessfulLogin() {
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

    }

    @Test(groups = {"login"})
    public void testUnsuccessfulLogin() {
        loginPage.login("Admin", "sdfdfds");
        Assert.assertTrue(loginPage.invalidLoginMessage.isDisplayed());
    }


}
