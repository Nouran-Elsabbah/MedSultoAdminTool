package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(.,'Content Managment')]")
    WebElement contentManaementBTN;

    @FindBy(linkText = "Specialties List")
    WebElement specialtiesList;

    @FindBy(linkText = "Trending Topics")
    WebElement  trendingTopics;

    @FindBy(xpath = "//button[contains(.,'Create Speciality')]")
    WebElement createSpeciality;

    @FindBy(xpath = "//button[contains(.,'Create Trending Topic')]")
    WebElement createTrendingTopic;

    public void ClickOnContentManagementButton(){
        contentManaementBTN.click();
    }
    public void ClickOnSpecialtiesList(){
        specialtiesList.click();
    }
    public void ClickOnCreateSpecialityButton(){
        createSpeciality.click();
    }
    public void ClickOnTrendingTopics(){
        trendingTopics.click();
    }
    public void ClickOnCreateTrendingTopicsButton(){
        createTrendingTopic.click();
    }
}
