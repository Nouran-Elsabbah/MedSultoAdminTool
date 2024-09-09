package BDDTests;

import Configuration.loaddataproperties;
import Pages.Common;
import Pages.HomePage;
import Pages.Login;
import Pages.SubPages.AddNewSpecialityPage;
import Pages.SubPages.AddTrendingTopicPage;
import Utilities.HookFile;
import io.cucumber.java.en.*;


public class StepsDef {
    Login login;
    HomePage homePage;
    Common common;
    AddNewSpecialityPage addNewSpecialityPage;
    AddTrendingTopicPage addTrendingTopicPage;
    String email = loaddataproperties.UserData.getProperty("email");
    String password = loaddataproperties.UserData.getProperty("password");
    String name = loaddataproperties.UserData.getProperty("specialityName");
    String color = loaddataproperties.UserData.getProperty("color");
    String iconPath = loaddataproperties.UserData.getProperty("iconPath");

    @Given("The user enter the email")
    public void the_user_enter_the_email() {
        login=new Login(HookFile.driver);
        login.enterEmail(email);
    }
    @And("The user enter the password")
    public void the_user_enter_the_password() {
        login=new Login(HookFile.driver);
        login.enterUserPassword(password);
    }
    @And("The user clicks on login button to enter the home page")
    public void the_user_clicks_on_login_button_to_enter_the_home_page() {
        login=new Login(HookFile.driver);
        login.clickOnLoginButton();
    }
    @And("The User clicks on Content Management Button")
    public void the_user_clicks_on_content_management_button() {
        homePage=new HomePage(HookFile.driver);
        homePage.ClickOnContentManagementButton();
    }
    @And("The User Click on Specialities List")
    public void the_user_click_on_specialities_list() {
        homePage=new HomePage(HookFile.driver);
        homePage.ClickOnSpecialtiesList();
    }
    @And("The User Click on Create New Speciality")
    public void the_user_click_on_create_new_speciality() {
        homePage=new HomePage(HookFile.driver);
        homePage.ClickOnCreateSpecialityButton();
    }
    @And("The User Enter name")
    public void the_user_enter_name() {
        addNewSpecialityPage=new AddNewSpecialityPage(HookFile.driver);
        addNewSpecialityPage.EnterName(name);
    }
    @And("The user Enter color Code")
    public void the_user_enter_color_code() {
        addNewSpecialityPage=new AddNewSpecialityPage(HookFile.driver);
        addNewSpecialityPage.EnterColorCode(color);
    }
    @And("The user Select Icon")
    public void the_user_select_icon() {
        addNewSpecialityPage=new AddNewSpecialityPage(HookFile.driver);
        addNewSpecialityPage.SelectIcon(iconPath);
    }
    @And("The user click on Save Button")
    public void the_user_click_on_save_button() {
        addNewSpecialityPage=new AddNewSpecialityPage(HookFile.driver);
        addNewSpecialityPage.ClickOnSaveButton();
    }
    @Then("Verify That added Successfully")
    public void verify_that_added_successfully() {
        common=new Common(HookFile.driver);
        String ne = common.verifyNewCreation();
        System.out.println(ne);
    }

    @And("The User Click on Trending Topics")
    public void theUserClickOnTrendingTopics() {
        homePage=new HomePage(HookFile.driver);
        homePage.ClickOnTrendingTopics();
    }

    @And("The User Click on Create New Trending Topics")
    public void theUserClickOnCreateNewTrendingTopics() {
        homePage=new HomePage(HookFile.driver);
        homePage.ClickOnCreateTrendingTopicsButton();
    }

    @And("The User Select Country")
    public void theUserSelectCountry() {
        addTrendingTopicPage = new AddTrendingTopicPage(HookFile.driver);
        addTrendingTopicPage.selectCountry();
    }

    @And("The user Select Profession")
    public void theUserSelectProfession() {
        addTrendingTopicPage = new AddTrendingTopicPage(HookFile.driver);
        addTrendingTopicPage.selectProfession();
    }

    @And("The user Select Specialties")
    public void theUserSelectSpecialties() {
        addTrendingTopicPage = new AddTrendingTopicPage(HookFile.driver);
        addTrendingTopicPage.selectSpecialties();
    }

    @And("The user Select Trending Topic")
    public void theUserSelectTrendingTopic() {
        addTrendingTopicPage = new AddTrendingTopicPage(HookFile.driver);
        addTrendingTopicPage.selectTrendingTopic();
    }

    @And("The user Select Newsfeed Items")
    public void theUserSelectNewsfeedItems() {
        addTrendingTopicPage = new AddTrendingTopicPage(HookFile.driver);
        addTrendingTopicPage.selectNewsFeedItems();
    }

    @And("The user click on Publish Button")
    public void theUserClickOnPublishButton() {
        addTrendingTopicPage = new AddTrendingTopicPage(HookFile.driver);
        addTrendingTopicPage.clickOnPublishButton();
    }
}
