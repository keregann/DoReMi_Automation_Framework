Feature: Flights booking

  @sasha
  Scenario: Book a One Way flight
    Given 'Home' page is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' page is displayed
    When user clicks 'One Way Button'
    And user chooses 'Chisinau' for 'From'
    And user chooses 'Kiev' for 'To'
    And user sets '19' date for 'Depart Calendar'
    And user clicks 'Search Button'
    Then 'Flights Results' page is displayed

  @sasha
  Scenario: Book a Round Trip flight
    Given 'Home' page is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' page is displayed
    When user clicks 'Round Trip Button'
    And user chooses 'Chisinau' for 'From'
    And user chooses 'Kiev' for 'To'
    And user sets '19' date for 'Depart Calendar'
    And user sets '24' date for 'Return Calendar'
    And user clicks 'Search Button'
    Then 'Flights Results' page is displayed
