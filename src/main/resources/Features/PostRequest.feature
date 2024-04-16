Feature: Testing API Request

  @POST
  Scenario: POST Request
    Given Load URL
    And Load body
    When Hit Request
    Then Verify the result
