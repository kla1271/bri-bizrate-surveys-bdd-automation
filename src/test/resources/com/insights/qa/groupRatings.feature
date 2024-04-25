@groupRatings @all

Feature: Testing Group Ratings Endpoint

  Scenario: Testing for GroupId 1
    Given the service call endpoint getGroupRating
    When the endpoint is invoked with the following params
      | params        | values  |
      | groupId       | 1       |
    Then the service returns 200
    And groupRatings endpoint validate

  Scenario: Testing for GroupId 97
    Given the service call endpoint getGroupRating
    When the endpoint is invoked with the following params
      | params        | values  |
      | groupId       | 97      |
    Then the service returns 200
    And groupRatings endpoint validate









