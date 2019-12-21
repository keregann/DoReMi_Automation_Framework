@Margarita
Feature: Sign Up functionality

  Scenario: SignUp with valid credentials
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Sign Up'
    Then 'Sign Up' page is displayed
    When user enters the following values:
      | firstName    | Pop                   |
      | lastName     | Diana                 |
      | mobileNumber | 06521347              |
      | email        | abrakadabra26@mail.ru |
      | password     | 0123456               |
      | confirm      | 0123456               |
    And user clicks 'Sign Up'
    Then 'User Account' page is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login' page is displayed

  Scenario: Validate all fields on Sing Up page
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Sign Up'
    Then 'Sign Up' page is displayed
    When user clicks 'Sign Up'
    Then warning 'INVALID_EMAIL' is present on the page

  Scenario: Validate the connection between Password and Confirm Password
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Sign Up'
    Then 'Sign Up' page is displayed
    When user enters the following values:
      | password | 123654 |
      | confirm  | 123123 |
    And user clicks 'Sign Up'
    Then warning 'INVALID_MATCHING_OF_PASSWORD' is present on the page


  Scenario Outline: Validate Email and Password fields on Sing Up page
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'SignUp'
    Then 'SignUp' page is displayed
    When user enters the following values:
      | <key> | <value> |
    And user clicks 'Sign Up'
    Then warning '<message>' is present on the page

    Examples:
      | key      | value       | message               |
      | Password | 12345       | INVALID_DATA_PASSWORD |
      | Email    | adsdsdc.com | INVALID_DATA_MAIL     |
      | Email    | addc@xds    | INVALID_DATA_MAIL     |

