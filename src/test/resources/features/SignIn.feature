Feature: Sign In Feature

#this is comment

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'ihateteacher@tek.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  @signInTest
  Scenario Outline: Verify user can login with different email and pass
    And User enter email <email> and password <password>
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                    | password    |
      | 'ihateteacher@tek.com'   | 'Tek@12345' |
      | 'panthers1@tekschool.us' | 'Tek@12345' |
      | 'panthers2@tekschool.us' | 'Tek@12345' |
