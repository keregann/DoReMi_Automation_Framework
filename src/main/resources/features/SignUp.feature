Feature: Sign Up functionality

  @margo
  Scenario: SignUp with valid credentials
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Sign Up'
    Then 'Sign Up' page is displayed
    When user enters the following values:
      | firstName    | Pop              |
      | lastName     | Diana            |
      | mobileNumber | 06521347         |
      | email        | abrakadabra15@mail.ru |
      | password     | 0123456          |
      | confirm      | 0123456          |
    And user clicks 'Sign Up'
    Then 'User Account' page is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login' page is displayed

  @margo
  Scenario: Validate all fields on Sing Up page
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Sign Up'
    Then 'Sign Up' page is displayed
    When user clicks 'Sign Up'
    Then 'warning' message is displayed

  @margo
  Scenario: Validate the connection between Password and Confirm Password
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Sign Up'
    Then 'Sign Up' page is displayed
    When user enters the following values:
      | password | 123654 |
      | confirm  | 123123 |
    And user clicks 'Sign Up'
    Then 'warning' message is displayed


#  Scenario Outline: Validate Email and Password fields on Sing Up page
#    Given 'Home' Page is displayed
#    When user clicks 'My Account'
#    And user clicks 'SingUp'
#    Then 'SingUp' Page is displayed
#    When user enters the following values:
#      | key   | value   |
#      | <key> | <value> |
#    And user clicks 'Sing Up'
#    Then warning message is present on the page
#
#    Examples:
#      | key      | value                                                                 |
#      | Password | 12345                                                                 |
#      | Email    | adsdsdc.com                                                           |
#      | Email    | addc@xds                                                              |
#      | Email    | axdfvgsxsdfdcxzswesdssaxzaswxdssxssawedsssxazwedwsawedsaswsdaqwsd@e.c |


