package Pages.SubPages;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTrendingTopicPage extends BasePage {
    public AddTrendingTopicPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[1]")
    WebElement Country;
    @FindBy(id = "item-0")
    WebElement item;
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[2]")
    WebElement profession;
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[3]")
    WebElement specialties;
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[4]")
    WebElement trendingTopic;

    @FindBy(xpath = "//span[contains(.,'dd')]")
    WebElement dd;
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[5]")
    WebElement newsfeedItems;

    @FindBy(xpath = "//button[contains(.,'Publish')]")
    WebElement publishBTN;

    public void selectCountry(){
        Country.click();
        item.click();
    }
    public void selectProfession(){
        profession.click();
        item.click();
    }

    public void selectSpecialties(){
        specialties.click();
        item.click();
    }
    public void selectTrendingTopic(){
        trendingTopic.click();
        dd.click();
    }
    public void selectNewsFeedItems(){
        newsfeedItems.click();
        item.click();
    }

    public void clickOnPublishButton(){
        publishBTN.click();
    }

}
