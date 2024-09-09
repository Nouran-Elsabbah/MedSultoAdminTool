package Pages.SubPages;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewSpecialityPage extends BasePage {
    public AddNewSpecialityPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "color")
    WebElement color;

    @FindBy(id = "projectCoverUploads")
    WebElement projectCoverUploads;

    @FindBy(xpath = "//label[@for='multiple'][contains(.,'Pharmacist')]")
    WebElement pharmacist;
    @FindBy(xpath = "//button[@class='btn btn-psp-primary'][contains(.,'Save')]")
    WebElement saveBTN;

    public void EnterName(String value){
        name.clear();
        name.sendKeys(value);
    }

    public void EnterColorCode(String value){
        color.clear();
        color.sendKeys(value);
    }

    public void SelectIcon(String value){
        projectCoverUploads.sendKeys(value);
    }

    public void ClickOnSaveButton(){
        saveBTN.click();
    }

    public void selectProfessionTypePharmacist(){
        pharmacist.click();
    }
}
