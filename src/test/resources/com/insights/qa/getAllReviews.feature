@getAllReviews @all

Feature: Testing Get All Reviews Endpoint

  Scenario: Testing for Lockwood getAllReviews
    Given the service call endpoint getAllReviews
    When the endpoint is invoked with the following params
      | params        | values      |
      | merchantId    | 170739      |
      | startDate     | 2024-04-01  |
      | endDate       | 2024-04-15  |
      | startIndex    | 1           |
      | size          | 1           |
      | minOSAT       | 5           |
    Then the service returns 200
#    And navigate to url

  Scenario: Testing for Lockwood getAllReviews 2
    Given the service call endpoint getAllReviews
    When the endpoint is invoked with the following params
      | params        | values      |
      | merchantId    | 170739      |
      | startDate     | 2024-04-01  |
      | endDate       | 2024-04-15  |
      | startIndex    | 1           |
      | size          | 20          |
    Then the service returns 200    
