@ui
Feature: Login Feature

  Scenario: Verify search count displays on the page
    Given user open website
    Then verify user is on home page
    And when user search with the keyword "search.keyword"
    Then verify search result count displayed on the page
    And verify search result has a first project 'first.project.name'
    When user clicks on About link from the footer
    Then verify about page is displayed


