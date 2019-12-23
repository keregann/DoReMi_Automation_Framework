@Sasha
Feature: Book a flight

  Scenario: US_4_TC_1_Book a One Way flight
    Given 'Home' page is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' page is displayed
    When user clicks 'One Way Button'
    And from the 'Flight Class' user chooses 'Business'
    And user chooses 'Chisinau' for 'From'
    And user chooses 'Kiev' for 'To'
    And user sets '25' date for 'Depart Calendar'
    And user sets '4' person for 'Adults'
    And user sets '3' person for 'Child'
    And user sets '2' person for 'Infant'
    And user clicks 'Search Button'
    Then 'Flights Results' page is displayed
    When user sets the price range
    And user clicks 'Air Moldova CheckBox'
    And user clicks 'Book Now Button'
    Then 'Flight Booking' page is displayed
    When user scrolls the page to 'Billing Address' section
    And from the 'Title' user chooses 'Mrs.'
    And user enters the following values:
      | name           | Alex           |
      | surname        | Fasii          |
      | email          | alex@gmail.com |
      | phone          | 0123456789     |
      | birthday       | 1990-01-01     |
      | passport       | 012345678      |
      | expirationdate | 2020-01-01     |
    And from the 'Nationality' user chooses 'ANGOLA'
    And user scrolls the page to 'Payment Types' section
    And from the 'Card Type' user chooses 'Visa'
    And from the 'Expiry Month' user chooses 'June (06)'
    And from the 'Expiry Year' user chooses '2026'
    And user enters the following values:
      | cardnumber | 1234569256813246 |
      | cvv        | 456              |
    And user scrolls the page to 'Read the Terms' section
    And user clicks 'Accept Checkbox'
    And user clicks 'Availability Checking Button'
    Then 'Flight Booking' page is displayed


  Scenario: US_4_TC_2_Book a Round Trip flight
    Given 'Home' page is displayed
    When user clicks 'Flights Tab'
    Then 'Flights Tab' page is displayed
    When user clicks 'Round Trip Button'
    And from the 'Flight Class' user chooses 'First'
    And user chooses 'Chisinau' for 'From'
    And user chooses 'Kiev' for 'To'
    And user sets '24' date for 'Depart Calendar'
    And user sets '30' date for 'Return Calendar'
    And user sets '2' person for 'Adults'
    And user clicks 'Search Button'
    Then 'Flights Results' page is displayed
    When user clicks 'Book Now Button'
    Then 'Flight Booking' page is displayed