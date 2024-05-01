package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage extends BasePage {
    public CommonPage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(linkText = "PIM")
    public WebElement pimTab;

    @FindBy(linkText = "Leave")
    public WebElement leaveTab;

    @FindBy(linkText = "Dashboard")
    public WebElement dashTab;


    @FindBy(xpath = "//a[@href='/web/index.php/directory/viewDirectory']")
    public WebElement directory;

    public void clickDirectory(){
        directory.click();
    }


    @Override
    public void search(String... parameters) {
        return;
    }
}
