Feature: Amazon Login and Search functionality

  Background: 
    Given website is open

  @test
  Scenario: Login functionality on Amazon
    Given user is on amazon website
    When user clicks sign in
    And user enters pooja@gmail.com
    And clicks on continue button
    And user is entering pooja
    Then user is navigated to home page

    
  @test
  Scenario: Search for product
    And user is on Amazon homepage
    When user searches for watches
    Then search result for watches are displayed
