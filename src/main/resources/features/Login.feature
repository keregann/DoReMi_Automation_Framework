Feature:Login
  Background:
    Given the 'Login' page is displayed

     Scenario: Successful Login using valid credentials
      Given User enters Email as 'user@phptravels.com' and Password as 'demouser'
      And clicks 'Login' button
      Then 'My Account' page is displayed

     Scenario: Login using invalid data
       Given User enters invalid Email as 'sdgdgsd' and Password as 'demouser'