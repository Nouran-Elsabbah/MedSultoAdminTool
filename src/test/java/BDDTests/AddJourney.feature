Feature: Add Content Management Journey

  Background:
    Given The user enter the email
    And The user enter the password
    And The user clicks on login button to enter the home page
    And The User clicks on Content Management Button


  Scenario:As a user i want to add new Speciality
    And The User Click on Specialities List
    And The User Click on Create New Speciality
    And The User Enter name
    And The user Enter color Code
    And The user Select Icon
    And The user click on Save Button
    Then Verify That added Successfully

  Scenario:As a user i want to add new Trending Topic
    And The User Click on Trending Topics
    And The User Click on Create New Trending Topics
    And The User Select Country
    And The user Select Profession
    And The user Select Specialties
    And The user Select Trending Topic
    And The user Select Newsfeed Items
    And The user click on Publish Button
    Then Verify That added Successfully