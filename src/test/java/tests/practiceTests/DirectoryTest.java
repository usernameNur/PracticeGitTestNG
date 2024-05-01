package tests.practiceTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DirectoryPage;
import pages.LoginPage;
import utilities.Driver;

public class DirectoryTest {
    LoginPage loginPage=new LoginPage();
DirectoryPage directoryPage=new DirectoryPage();
    CommonPage commonPage=new CommonPage();
    WebDriver driver= Driver.getDriver();
    @BeforeMethod
    public void login() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");


    }


    @Test

    public void verifyPersonOnTheList() throws InterruptedException {
        Thread.sleep(5000);
        commonPage.clickDirectory();

        directoryPage.search();


        Assert.assertEquals(directoryPage.verifyHR.getText(), directoryPage.hrManager.getText());
        Assert.assertTrue(directoryPage.verifyHR.isDisplayed());

        directoryPage.printURL();
        directoryPage.printTitle();
        directoryPage.search("John Doe","HR Manager","Remote");


    }



}
