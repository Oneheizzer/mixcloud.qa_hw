Feature: Login into Mixcloud website
  Existing user should be able to login into account using correct credentials

  Scenario Outline: Login into account with correct credentials
    Given User navigates to mixcloud website
    When User clicks on the login button on homepage
    And User enters a valid username "<username>"
    And User enters a valid password "<password>"
    When User clicks on the login button
    Then User should be logged in
    When User clicks on search field
    And User enter a valid author
    Then User should be at the author page
    When User clicks on play button
    When User marks a favorite music
    And User checks a favorite playlist
    Then User should be able to see a favorite music
    When User deletes a favorite music from a favorite playlist



    Examples:
      |     username            |   password   |
      |  oneheizzer.qa@gmail.com |   41177232u  |