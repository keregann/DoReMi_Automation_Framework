Feature:User book hotel

#Scenario 1
  @Ion
  Scenario:User book hotel
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


##Scenario 2
#  Scenario Outline: Booking hotel using invalid booking information
#    Given a user logs in with valid credentials
#    And 'Main' Page is displayed
#    When user clicks 'Hotels' category tab
#    And user input following data:
#      | Destination | CheckIn | CheckOut | Adults | child |
#      | Chisinau    | 18      | 20       | 2      | 0     |
#    And user clicks 'Search hotel' button
#    And user clicks 'hotel Details' button
#    And user clicks 'See Price and Date' button
#      #for navigate to Price and Date section
#    And user clicks 'Book Hotel' button
#    And user input following valid booking information:
#      | Title   | FirstName   | LastName   | Country   | Email   | Phone   |
#      | <title> | <firstName> | <lastName> | <country> | <email> | <phone> |
#    And user clicks 'Complete Booking' button
#    Then warning message will be displayed in fields with invalid data
#
#    Examples:
#      | title | firstName | lastName     | country     | email              | phone             |
#      | Mr    | Ion       | Drone        | Moldova     | ion.drone@mail.com | 06868686868       |
#      |       | Ion       | Drone        | Moldova     | ion.drone@mail.com | 06868686868       |
#      | Mr    |           | Drone        | Moldova     | ion.drone@mail.com | 06868686868       |
#      | Mr    | Ion       |              | Moldova     | ion.drone@mail.com | 06868686868       |
#      | Mr    | Ion       | Drone        |             | ion.drone@mail.com | 06868686868       |
#      | Mr    | Ion       | Drone        | Moldova     |                    | 06868686868       |
#      | Mr    | Ion       | Drone        | Moldova     | ion.drone@mail.com |                   |
#      |       |           |              |             |                    |                   |
#      | Mr    | Ion*43//* | Drone3424^%- | Moldova232% | ion.dronemail.com  | 06868686868686868 |
#
#
#
##Scenario 3
#  Scenario Outline: Booking hotel using invalid credit card information
#    Given a user logs in with valid credentials
#    And 'Main' Page is displayed
#    When user clicks 'Hotels' category tab
#    And user input following data:
#      | destination | checkIn | checkOut | adults | child |
#      | Chisinau    | 18      | 20       | 2      | 0     |
#    And user clicks 'Search hotel' button
#    And user clicks 'hotel Details' button
#    And user clicks 'See Price and Date' button
#      #for navigate to Price and Date section
#    And user clicks 'Book Hotel' button
#    And user input following valid booking information:
#      | title | firstName | lastName | country | email              | phone       |
#      | Mr    | Ion       | Drone    | Moldova | ion.drone@mail.com | 06868686868 |
#    And user clicks 'Complete Booking' button
#    Then warning message will be displayed in fields with invalid data
#
#    Examples:
#      | name           | cardNumber        | month | year | securityCode |
#      |                | 1234123412341234  | 02    | 2020 | 111          |
#      | Ion Ghincolov  |                   | 02    | 2020 | 111          |
#      | Ion Ghincolov  | 1234123412341234  |       | 2020 | 111          |
#      | Ion Ghincolov  | 1234123412341234  | 02    |      | 111          |
#      | Ion Ghincolov  | 1234123412341234  | 02    | 2020 |              |
#      | I              | 12341234123412    | 2     | 20   | 11           |
#      | Ion Ghincolov  | 12341234123412341 | 13    | 2030 | 1111         |
#      | Ion-Ghincolov! | 123a123b123-123*  | a2    | 2b2* | 1x1          |
#
#
##Scenario 4
#  Scenario: Booking hotel as guest
#    Given 'Main' Page is displayed
#    When user clicks 'Hotels' category tab
#    And user input following data:
#      | Destination | CheckIn | CheckOut | Adults | child |
#      | Chisinau    | 12      | 14       | 2      | 0     |
#    And user clicks 'Search hotel' button
#    And user clicks 'hotel Details' button
#    And user clicks 'See Price and Date' button
#      #for navigate to Price and Date section
#    And user clicks 'Book Hotel' button
#    And user input following valid booking information:
#      | Title | FirstName | LastName | Country | Email              | Phone       |
#      | Mr    | Ion       | Drone    | Moldova | ion.drone@mail.com | 06868686868 |
#    And user input following valid card details:
#      | Name          | CardNumber       | Month | Year | SecurityCode |
#      | Ion Ghincolov | 1234123412341234 | 02    | 2020 | 111          |
#    And user clicks 'Complete Booking' button
#    Then 'invoice' Page is displayed




