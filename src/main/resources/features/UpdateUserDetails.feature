Feature: Login

  Scenario: Login and update user details
    Given user is on the Account Page
    When user choose My Account menu
    And user choose Account
    And user change 'Stefan Cel Mare 7/1','Chisinau','Mun. Chisinau','2020','Moldova','085832416'
    And click on SUBMIT button
    Then update are saved
    And user is redirected to Account Page
