Feature: Login functionality

  @margo@login
  Scenario: Login with valid credentials
    Given 'Home' Page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' Page is displayed
    When user enters the following values:
      | key      | value               |
      | email    | user@phptravels.com |
      | password | demouser            |

    And user clicks 'Login'
    Then 'User Account' Page is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login' Page is displayed

  @margo
  Scenario: Login with invalid valid credentials
    Given 'Home' Page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' Page is displayed
    When user enters the following values:
      | key      | value                       |
      | email    | margarita.gabureac@mail.com |
      | password | 0123                        |
    And user clicks 'Login'
    Then 'warning' message is displayed

