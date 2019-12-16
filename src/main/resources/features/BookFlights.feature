Feature:

  @sasha
  Scenario: Book a flight
    Given 'Home Page' is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' is displayed
    When user clicks 'One Way Button'
    When user enters the following values:
      | key  | value    |
      | from | Chisinau |
      | to   | Kiev     |

    And sets the following date:
      | date | 2019-12-17 |

    And user clicks 'Search Button'
    Then 'Flights Results Page' is displayed


#  Scenario: 2
#    Given 'Home Page' is displayed
#    When user clicks 'Flights Tab'
#    Then 'Flights Tab' is displayed
#    When user clicks 'One Way Button'
#    When user enters the following values:
#      | key  | value    |
#      | from | Chisinau |
#      | to   | Kiev     |
#
#    And user clicks 'Search Button'
#    Then 'Flights Results Page' is displayed
