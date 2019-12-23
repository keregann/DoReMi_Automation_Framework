@Ion
Feature:User book hotel

  Scenario:US_3_TC_1 User book hotel as guest
    Given 'Home' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses 'Chisinau' for 'destination'
    And user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user sets '2' person for 'Adults'
    And user sets '1' person for 'Child'
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    When user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When from the 'Title' user chooses 'Mr.'
    When user enters the following values:
      | firstName | Ion                |
      | lastName  | Drone              |
      | email     | ion.drone@mail.com |
      | phone     | 06868686868        |
    And user clicks 'Complete Booking' button
    Then 'Payment' page is displayed

  Scenario:US_3_TC_2 User book hotel with account
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
    And user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user sets '2' person for 'Adults'
    And user sets '1' person for 'Child'
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    When user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When from the 'Title' user chooses 'Mr.'
    And user enters the following values:
      | firstName | Ross                |
      | lastName  | Brown               |
      | email     | ross.brown@mail.com |
      | phone     | 0789981145          |
    And user clicks 'Complete Booking' button
    Then 'Payment' page is displayed

  Scenario:US_3_TC_3 User modify the booking date
    Given 'Home' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses 'Chisinau' for 'destination'
    And user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user sets '2' person for 'Adults'
    And user sets '1' person for 'Child'
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    When user clicks 'See Price and Date Button'
    When user enters the following values:
      | checkIn  | 27/12/2019 |
      | checkOut | 30/12/2019 |
    And user clicks 'Search' button
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    When user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When from the 'Title' user chooses 'Mrs.'
    And user enters the following values:
      | firstName | Angela                |
      | lastName  | Sweet                 |
      | email     | Angela.Sweet@mail.com |
      | phone     | 07879674239           |
    And user clicks 'Complete Booking' button
    Then 'Payment' page is displayed

  Scenario Outline:US_3_TC_4 User book hotel using invalid destination details
    Given 'Home' page is displayed
    When user clicks 'Hotels'
    Then 'Hotels Tab' page is displayed
    When user chooses '<destination>' for 'destination'
    And user enters the following values:
      | checkIn  | <checkIn>  |
      | checkOut | <checkOut> |
    And user clicks 'Search'
    Then warning '<message>' is present on the page
    Examples:
      | destination | checkIn    | checkOut   | message                   |
      | Bukharest   | 28/12/2019 | 31/12/2019 | INVALID_MATCHING_LOCATION |
      |             | 28/12/2019 | 31/12/2019 | INVALID_MATCHING_LOCATION |
      | Bucharest   | 17/13/2006 | 31/12/2019 | INVALID_DATE              |
      | Bucharest   | 28/12/2019 | 17/13/2006 | INVALID_DATE              |

  Scenario Outline:US_3_TC_5 User book hotel using invalid personal information
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
    And user enters the following values:
      | checkIn  | 28/12/2019 |
      | checkOut | 31/12/2019 |
    And user clicks 'Search'
    Then 'Hotels' page is displayed
    When user clicks 'Details Button'
    Then 'Hotel Details' page is displayed
    When user clicks 'See Price and Date Button'
    And user clicks 'Book Now Button'
    Then 'Booking Details' page is displayed
    When user enters the following values:
      | firstName | <first name> |
      | lastName  | <last name>  |
      | email     | <email>      |
      | phone     | <phone>      |
    And user clicks 'Complete Booking' button
    And warning 'INVALID_FIRST_NAME' is present on the page
    And warning 'INVALID_LAST_NAME' is present on the page
    And warning 'INVALID_EMAIL' is present on the page
    Then warning 'INVALID_PHONE_NUMBER' is present on the page
    Examples:
      | first name | last name    | email             | phone            |
      | Ion*43//*  | Drone3424^%- | ion.dronemail.com | 068686868dsdd868 |
      |            |              |                   |                  |



