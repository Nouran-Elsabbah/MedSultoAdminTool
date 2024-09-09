package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common extends BasePage{
    public Common(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "alert-text")
    WebElement alert;
    public String verifyNewCreation(){
        return alert.getText();
    }
}
