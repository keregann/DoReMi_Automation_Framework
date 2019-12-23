Feature: Book a tour

  Scenario: US_5_TC_1_Book a couple tour
    Given 'Home' page is displayed
    When user clicks 'Tours Tab'
    Then 'Tours Tab' page is displayed
    When from the 'Destination' user chooses 'Sheraton Trip'
    And from the 'Tour Type' user chooses 'Couples'
    And user sets '25' date for 'Date'
    And user sets '2' person for 'Adults'
    And user clicks 'Search Button'
    Then 'Tour' page is displayed
    When user clicks 'Description Button'
    And user clicks 'Book Now Button'
    Then 'Tour Book' page is displayed
    When user scrolls the page to 'Personal Details' section
    And user enters the following values:
      | firstname | Alex           |
      | lastname  | Sopirla        |
      | email     | fasii@mail.com |
      | confirm   | fasii@mail.com |
      | mobile    | 079382314      |
      | address   | Stefan 14      |
    And from the 'Country' user chooses 'Australia'
    And user clicks 'slider'
    And user enters the following values:
      | textfield | Hello world |
    And user scrolls the page to 'Coupon Code' section
    And user enters the following values:
      | code           | 12345    |
      | guest1name     | Alex     |
      | guest1passport | 12345678 |
      | guest1age      | 26       |
      | guest2name     | Daria    |
      | guest2passport | 87654321 |
      | guest2age      | 25       |
    And user clicks 'Confirm This Booking Button'
    Then 'Trip Invoice' page is displayed
    And warning 'INVALID_BOOKING_STATUS' is present on the page


  Scenario: US_5_TC_2 Book a couple tour ignoring the email field
    Given 'Home' page is displayed
    When user clicks 'Tours Tab'
    Then 'Tours Tab' page is displayed
    When from the 'Destination' user chooses 'Sheraton Trip'
    And from the 'Tour Type' user chooses 'Couples'
    And user sets '25' date for 'Date'
    And user sets '2' person for 'Adults'
    And user clicks 'Search Button'
    Then 'Tour' page is displayed
    When user clicks 'Description Button'
    And user clicks 'Book Now Button'
    Then 'Tour Book' page is displayed
    When user scrolls the page to 'Personal Details' section
    And user enters the following values:
      | firstname | Alex      |
      | lastname  | Sopirla   |
      | email     |           |
      | confirm   |           |
      | mobile    | 079382314 |
      | address   | Stefan 14 |
    And from the 'Country' user chooses 'Australia'
    And user clicks 'slider'
    And user enters the following values:
      | textfield | Hello world |
    And user scrolls the page to 'Coupon Code' section
    And user enters the following values:
      | code           | 12345    |
      | guest1name     | Alex     |
      | guest1passport | 12345678 |
      | guest1age      | 26       |
      | guest2name     | Daria    |
      | guest2passport | 87654321 |
      | guest2age      | 25       |
    And user clicks 'Confirm This Booking Button'
    Then warning 'TOUR_BOOKING_INVALID_EMAIL' is present on the page