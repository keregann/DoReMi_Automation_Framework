Feature: Flights booking

  @sasha
  Scenario: Book a One Way flight
    Given 'Home' page is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' page is displayed
    When user clicks 'One Way Button'
    And from the 'Drop Down List' user chooses 'Business'
    And user chooses 'Chisinau' for 'From'
    And user chooses 'Kiev' for 'To'
    And user sets '25' date for 'Depart Calendar'
    And user sets '2' person for 'Adults'
    And user sets '3' person for 'Child'
    And user sets '5' person for 'Infant'
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
    And user sets '25' date for 'Depart Calendar'
    And user sets '30' date for 'Return Calendar'
    And user clicks 'Search Button'
    Then 'Flights Results' page is displayed
