Feature: Test world time endpoint to consult all the timezones that exist

  Scenario: Check how timezone endpoint works
    Given I have the correct endpoint
    When I get endpoint timezone
    Then I should assert the response headers, body, and status code

  Scenario: Check how timezone Bogota endpoint works
    Given I have the correct endpoint
    When I get endpoint timezone America Bogota
    Then I should assert the response headers, body, and status code

  Scenario: Check how timezone Bogota endpoint works
    Given I have the correct endpoint
    When I get endpoint timezone
    Then I should assert the response body


