Feature: Login Function

  @UI
  Scenario: User should able to login with valid credentials
    Given Launch browser & open portal
    When Enter user Id as "admin@yourstore.com" & password as "admin"
    And Click on Login button
    Then User should get redirected to home page

    @API
  Scenario: Testing get request
    Given load the URL
    When Hit the URL
    Then get the response