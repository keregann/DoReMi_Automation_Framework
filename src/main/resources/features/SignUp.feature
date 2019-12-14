Feature: Sing Up functionality

  Scenario: SingUp with valid credentials
    Given user is on the 'Home Page'
    When user clicks 'My Account' menu
    And user clicks 'SingUp' button
    Then 'SingUp' Page is displayed
    When user enters following values into the form
      | Field           | Value        |
      | firstName       | Pop          |
      | lastName        | Diana        |
      | mobileNumber    | 06521347     |
      | email           | dpop@mail.ru |
      | password        | 0123456      |
      | confirmPassword | 0123456      |

    And  user clicks on 'Sing Up' button
    Then 'Account' Page is displayed
    When user clicks on 'My Account' menu
    And user clicks on 'Logout' button
    Then user is on the 'Home Page'

  Scenario Outline: Validate Email and Password fields on Sing Up page
    Given user is on the 'Home Page'
    When user clicks 'My Account' menu
    And user clicks 'SingUp' button
    Then 'SingUp' Page is displayed
    When user enters  in <field_name> the <value> invalid data
    And user clicks on 'Sing Up' button
    Then warning message is present on the page
    Examples:
      | field_name | value                                                                 |
      | Password   | 12345                                                                 |
      | Email      | adsdsdc.com                                                           |
      | Email      | addc@xds                                                              |
      | Email      | axdfvgsxsdfdcxzswesdssaxzaswxdssxssawedsssxazwedwsawedsaswsdaqwsd@e.c |

  Scenario: Validate all fields on Sing Up page
    Given user is on the 'Home Page'
    When user clicks 'My Account' menu
    And user clicks 'SingUp' button
    Then 'SingUp' Page is displayed
    When user leave all fields empty
    And user clicks on 'Sing Up' button
    Then warning message is present on the page

  Scenario: Validate the connection between "Password" and "Confirm Password"
    Given user is on the 'Home Page'
    When user clicks 'My Account' menu
    And user clicks 'SingUp' button
    Then 'SingUp' Page is displayed
    When user change the fields by entering value
      | Password | Confirm |
      | 123654   | 123123  |
    And user clicks on 'Sing Up' button
    Then warning message is present on the page



