package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class DirectoryPage extends BasePage {

    public DirectoryPage() {
        super(Driver.getDriver());

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]")
    public WebElement jobTitle;
    @FindBy(xpath="//*[text()='HR Manager']")
    public WebElement hrManager;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
@FindBy(xpath = "//p[text()='HR Manager']")
    public WebElement verifyHR;


public  void search(){
    jobTitle.click();
    hrManager.click();
    searchButton.click();
}

    @Override
    public void search(String... parameters) {
        String employeeName=parameters[0];
        String jobTitle=parameters[1];
        String location=parameters[2];
    }
}
