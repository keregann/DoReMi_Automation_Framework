Feature: Login functionality

  @margo@login
  Scenario: Login with valid credentials
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
#    //  | key      | value               |
      | email    | user@phptravels.com |
      | password | demouser            |

    And user clicks 'Login Button'
    Then 'User Account' page is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login' page is displayed

  @margo
  Scenario: Login with invalid valid credentials
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | margarita.gabureac@mail.com |
      | password | 0123                        |
    And user clicks 'Login Button'
#    Then following message is displayed:
#      |Message|

