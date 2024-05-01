package tests.practiceTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PIMTests {
    LoginPage loginPage=new LoginPage();

    PIMPage pimPage=new PIMPage();
    CommonPage commonPage=new CommonPage();
    WebDriver driver= Driver.getDriver();
    @BeforeTest
    public void login(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");

    }




    @Test
    public void verifyAdminCanCreateEmployee(){

        commonPage.pimTab.click();
        pimPage.addEmployee();

        String expectedName=pimPage.fName+" "+pimPage.lastName;

        SeleniumUtils.verifyTextInElement(driver,20,pimPage.fullNameText, expectedName);

        WebElement empIdInTable=driver.findElement(By.xpath("dive[text()='"+pimPage.empID+"']"));
        WebElement firstNameInTable=driver.findElement(By.xpath("dive[text()='"+pimPage.empID+"']/../following-sibling::div[1]"));
        WebElement lastNameInTable=driver.findElement(By.xpath("dive[text()='"+pimPage.empID+"']/../following-sibling::div[2]"));

        //verifying with seleniumUtils
        SeleniumUtils.verifyTextInElement(driver, 10,empIdInTable, pimPage.empID);
        SeleniumUtils.verifyTextInElement(driver, 10,firstNameInTable, pimPage.fName);
        SeleniumUtils.verifyTextInElement(driver, 10,lastNameInTable, pimPage.lName);

        //verifying with assertions
        Assert.assertEquals(empIdInTable.getText(),pimPage.empID);
        Assert.assertEquals(firstNameInTable.getText(),pimPage.fName);
        Assert.assertEquals(lastNameInTable.getText(),pimPage.lName);


    }





}
