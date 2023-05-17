Feature: register

  @register@all
  Scenario: As a user, I should able to register successfully so that, I can use all use featyres
    Given I am on registration page
    When I enter required registration details with timestamp
    Then I should able to register successfully


