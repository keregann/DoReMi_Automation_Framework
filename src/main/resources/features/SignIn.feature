Feature: SignIn

  Scenario: Login with valid credentials and logout
    Given user is on the Home Page
    When user clicks My Account menu
    And user clicks Login
    Then Login Page is displayed
    When user enters 'user@phptravels.com' as email and 'demouser' as password
    And clicks on Login button
    Then Account Page is displayed
    When user clicks on My Account dropdown
    And clicks on Logout link
    Then user is on the Home Page

  Scenario: Second scenario
    Given user is on the Home Page
    When user clicks My Account menu
    And user clicks Login
    Then Login Page is displayed
    When user enters 'user@phptravels.com' as email and 'demouser' as password
    And clicks on Login button
    Then Account Page is displayed
    When user clicks on My Account dropdown
    And clicks on Logout link
    Then user is on the Home Page