Feature:User apply for visa

  @Ion
  Scenario:TC_1 User apply for visa
    Given 'Home' page is displayed
    When user clicks 'Visa'
    Then 'Visa Tab' page is displayed
    When from the 'From Country field' user chooses 'Romania'
    And  from the 'To Country field' user chooses 'Australia'
    And user enters the following values:
      | date | 28/12/2019 |
    And user clicks 'Submit'
    Then 'Visa' page is displayed
    When user enters the following values:
      | firstName      | Alin               |
      | lastName       | Albu               |
      | email          | alin.albu@mail.com |
      | confirm email  | alin.albu@mail.com |
      | contact number | 07474747474        |
      | date           | 28/12/2019         |
    And user clicks 'Booking' button
    Then 'Visa Confirmation' page is displayed