Feature:

  @sasha
  Scenario: Book a flight
    Given 'Home' page is displayed
    When user clicks 'Flights Tab'
    Then 'FlightsTab' page is displayed
    When user clicks 'One Way Button'
#    When user enters the following values:
#      | key  | value    |
#      | from | Chisinau |
#      | to   | Kiev     |
#
#    And sets the following date:
#      | date | 2019-12-17 |

    And user clicks 'Search Button'
    Then 'Flights Results' Page is displayed

  @sasha
  Scenario: Book a Round Trip flight
    Given 'Home' Page is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' Page is displayed
    When user clicks 'One Way Button'
#    When user enters the following values:
#      | key  | value    |
#      | from | Chisinau |
#      | to   | Kiev     |

    And user clicks 'Search Button'
    Then 'Flights Results' Page is displayed
