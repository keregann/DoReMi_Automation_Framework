Feature: Login functionality

  Scenario: Login with valid credentials
    Given user is on the 'HomePage'
    When user clicks 'My Account' menu
    And user clicks 'Login' button
    Then 'Login' Page is displayed
    When user enters 'user@phptravels.com' as email and 'demouser' as password
    And user clicks on 'Login' button
    Then 'Account' Page is displayed
    When user clicks on 'My Account' menu
    And user clicks on 'Logout' button
    Then user is on the 'Home Page'

  Scenario: Login with invalid valid credentials
    Given user is on the 'Home Page'
    When user clicks 'My Account' menu
    And user clicks 'Login' button
    Then 'Login' Page is displayed
    When user enter invalid valid 'margarita.gabureac@mail.com' and '0123'
    And user clicks on 'Login' button
    Then warning message is present on the page

