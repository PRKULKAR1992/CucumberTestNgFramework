Feature: Login Function

  @UI
  Scenario: User should able to login with valid credentials
    Given Launch browser & open portal
    When Enter user Id as "admin@yourstore.com" & password as "admin"
    And Click on Login button
    Then User should get redirected to home page

  @UIWithScenarioOutline
  Scenario Outline:  User should able to login with valid credentials with scenario ouline
    Given Launch browser & open portal
    When Enter user Id as <EmailId> & password as <Password>
    And Click on Login button
    Then User should get redirected to home page

    Examples:
    |EmailId|Password|
    |admin@yourstore.com|admin|
    |admin123@yourstore.com|admin1|

    @API
  Scenario: Testing get request
    Given load the URL
    When Hit the URL
    Then get the response