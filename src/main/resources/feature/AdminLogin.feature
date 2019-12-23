Feature: Add new customer

  Scenario: US_6_TC_1_Add a new Customer from the Admin Panel
    Given 'Admin Login' page is displayed
    And admin enters the following values:
      | email    | admin@phptravels.com |
      | password | demoadmin            |
    And user clicks 'Login Button'
    Then 'Admin Panel' page is displayed
    When user clicks 'Accounts'
    And user clicks 'Customers'
    Then 'Customers' page is displayed
    When user clicks 'Add Button'
    Then 'Add Customer' page is displayed
    When user scrolls the page to 'Add Customer' section
    And user enters the following values:
      | firstname | Fedor                |
      | lastname  | Petru                |
      | email     | fedorpetru@gmail.com |
      | password  | 0123456789           |
      | mobile    | 079563219            |
      | address1  | Petru Movila 10      |
      | address2  | Stefan Cel Mare 101  |
    And from the 'Country' user chooses 'Algeria'
    And from the 'Status' user chooses 'Enabled'
    And user clicks 'Subscribe'
    And user clicks 'Submit Button'
    Then 'Customers' page is displayed
