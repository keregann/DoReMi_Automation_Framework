Feature:User book hotel
#Scenario 1
  @Ion
  Scenario:User book hotel as guest
    Given 'Home' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses 'Chisinau' for 'destination'
    When user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    And user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When user enters the following values:
      | firstName | Ion                |
      | lastName  | Drone              |
      | email     | ion.drone@mail.com |
      | phone     | 06868686868        |
    And user clicks the 'Complete Booking Button'
    Then 'Payment' page is displayed

#Scenario 2
  @Ion
  Scenario:User book hotel with account
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | user@phptravels.com |
      | password | demouser            |
    And user clicks 'Login Button'
    Then 'User Account' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses 'Chisinau' for 'destination'
    When user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    And user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When user enters the following values:
      | firstName | Ion                |
      | lastName  | Drone              |
      | email     | ion.drone@mail.com |
      | phone     | 06868686868        |
    And user clicks the 'Complete Booking Button'
    Then 'Payment' page is displayed

# Scenario 3
  @Ion
  Scenario:User modify the hotel destination and booking date
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | user@phptravels.com |
      | password | demouser            |
    And user clicks 'Login Button'
    Then 'User Account' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses 'Chisinau' for 'destination'
    When user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    And user clicks 'See Price and Date Button'
    #    incepem de aici

    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When user enters the following values:
      | firstName | Ion                |
      | lastName  | Drone              |
      | email     | ion.drone@mail.com |
      | phone     | 06868686868        |
    And user clicks the 'Complete Booking Button'
    Then 'Payment' page is displayed

##Scenario 4
  @Ion
  Scenario Outline:User book hotel using invalid destination details
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | user@phptravels.com |
      | password | demouser            |
    And user clicks 'Login Button'
    Then 'User Account' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses '<destination>' for 'destination'
    When user enters the following values:
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
    And user clicks 'Search'
#    Then warning message will be displayed in fields with invalid data
    Examples:
      | destination | checkIn    | checkOut   |
      | Bukharest   | 28/12/2019 | 31/12/2019 |
      |             | 28/12/2019 | 31/12/2019 |
      | Bucharest   | 17/13/2006 | 31/12/2019 |
      | Bucharest   | 28/12/2019 | 17/13/2006 |


#Scenario 5
  @Ion
  Scenario Outline:User book hotel using invalid personal information
    Given 'Home' page is displayed
    When user clicks 'My Account'
    And user clicks 'Login Button'
    Then 'Login' page is displayed
    When user enters the following values:
      | email    | user@phptravels.com |
      | password | demouser            |
    And user clicks 'Login Button'
    Then 'User Account' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses 'Chisinau' for 'destination'
    When user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    And user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When user enters the following values:
      | firstName | <first name> |
      | lastName  | <last name>  |
      | email     | <email>      |
      | phone     | <phone>      |
    And user clicks the 'Complete Booking Button'
#    Then warning message will be displayed in fields with invalid data
    Examples:
      | first name | last name    | email              | phone             |
      | Ion        | Drone        | ion.drone@mail.com | 06868686868       |
      | Ion        | Drone        | ion.drone@mail.com | 06868686868       |
      |            | Drone        | ion.drone@mail.com | 06868686868       |
      | Ion        |              | ion.drone@mail.com | 06868686868       |
      | Ion        | Drone        | ion.drone@mail.com | 06868686868       |
      | Ion        | Drone        |                    | 06868686868       |
      | Ion        | Drone        | ion.drone@mail.com |                   |
      |            |              |                    |                   |
      | Ion*43//*  | Drone3424^%- | ion.dronemail.com  | 06868686868686868 |



