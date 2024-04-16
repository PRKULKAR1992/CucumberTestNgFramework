Feature: Testing API Request

  @POST
  Scenario: POST Request
    Given Load URL
    And Load body
    When Hit Request
    Then Verify the result

    @GetSingleUser
    Scenario: Get single user using parameter
      Given Load URL for getting single user
      And add path parameter
      When hit request
      Then  verify response


