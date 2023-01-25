Feature: Login Feature

  Scenario: Verify user cannot login with invalid credential
    Given user open website
    Then verify user is on home page
    When user click on sign in button
    Then verify user is on login page
    When user login with username "invalid@gmail.co" and password "122345"
    Then verify invalid login error message is displayed