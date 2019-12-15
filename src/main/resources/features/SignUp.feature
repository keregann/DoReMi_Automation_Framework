Feature: Sing Up functionality

  Scenario: SingUp with valid credentials
    Given 'Home Page' is displayed
    When user clicks 'My Account'
    And user clicks 'SingUp'
    Then 'SingUp Page' is displayed
    When user enters the following values:
      | key             | Value        |
      | firstName       | Pop          |
      | lastName        | Diana        |
      | mobileNumber    | 06521347     |
      | email           | dpop@mail.ru |
      | password        | 0123456      |
      | confirmPassword | 0123456      |
    And user clicks 'Sing Up'
    Then 'User Account Page' is displayed
    When user clicks 'My Account'
    And user clicks 'Logout'
    Then 'Login Page' is displayed

  Scenario Outline: Validate Email and Password fields on Sing Up page
    Given 'Home Page' is displayed
    When user clicks 'My Account'
    And user clicks 'SingUp'
    Then 'SingUp Page' is displayed
    When user enters  in <field_name> the <value> invalid data
    And user clicks 'Sing Up'
    Then warning message is present on the page

    Examples:
      | field_name | value                                                                 |
      | Password   | 12345                                                                 |
      | Email      | adsdsdc.com                                                           |
      | Email      | addc@xds                                                              |
      | Email      | axdfvgsxsdfdcxzswesdssaxzaswxdssxssawedsssxazwedwsawedsaswsdaqwsd@e.c |

  Scenario: Validate all fields on Sing Up page
    Given 'Home Page' is displayed
    When user clicks 'My Account'
    And user clicks 'SingUp'
    Then 'SingUp Page' is displayed
    When user leave all fields empty
    And user clicks 'Sing Up'
    Then warning message is present on the page

  Scenario: Validate the connection between "Password" and "Confirm Password"
    Given 'Home Page' is displayed
    When user clicks 'My Account'
    And user clicks 'SingUp'
    Then 'SingUp Page' is displayed
    When user enters the following values:
      | key      | value  |
      | Password | 123654 |
      | Confirm  | 123123 |
    And user clicks 'Sing Up'
    Then warning message is present on the page



