Feature: Login functionality

  @login
  Scenario: Login with valid credentials(Positive flow)
    Given 'Home Page' is displayed
    When user clicks 'My Account'
    And user clicks 'Login'
    Then 'Login Page' is displayed
    When user enters the following values:
      | key      | value               |
      | email    | user@phptravels.com |
      | password | demouser            |

    And user clicks 'Login'
    Then 'User Account Page' is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login Page' is displayed

  Scenario: Login with invalid valid credentials
    Given user is on the 'Home Page'
    When user clicks 'My Account' menu
    And user clicks 'Login' button
    Then 'Login' Page is displayed
    When user enter invalid valid 'margarita.gabureac@mail.com' and '0123'
    And user clicks on 'Login' button
    Then warning message is present on the page

