@Margarita
Feature: Login functionality

  Scenario: US_1_TC_1 Login with valid credentials
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | user@phptravels.com |
      | password | demouser            |
    And user clicks 'Login Button'
    Then 'User Account' page is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login' page is displayed

  @run
  Scenario: US_1_TC_2 Login with invalid valid credentials
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | margarita.gabureac@mail.com |
      | password | 0123                        |
    And user clicks 'Login Button'
    Then warning 'INVALID_LOGIN_PASSWORD' is present on the page