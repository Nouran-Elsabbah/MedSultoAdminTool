package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{
    public Login(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="email")
    WebElement email;
    @FindBy(id="password")
    WebElement password;
    @FindBy(xpath="//button[@role='button']")
    WebElement loginBTN;
    public void enterEmail(String usernameValue){
        email.clear();
        email.sendKeys(usernameValue);
    }
    public void enterUserPassword(String passwordValue){
        password.clear();
        password.sendKeys(passwordValue);
    }
    public void clickOnLoginButton(){
        loginBTN.click();
    }
}
