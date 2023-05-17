Feature:referAFriend
  @referAfriend@all
  Scenario: As a user, I should able to send refer email to friend successfully
  so that, I can refer a product to friend

    Given I am on registeration
    When I enter required registration details
    And I am on login page
    And I enter valid email and password
    And I click on Apple Mac Book Pro 13Inch
    And I click email a friend
    And I enter friend's email and message
    Then I should email a friend successfully

