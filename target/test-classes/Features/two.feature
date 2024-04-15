Feature: Amazon Login and Search

  Background: 
    Given now chrome is open

  @test
  Scenario: Open New-releases on amazon
    Given user is on website
    When user clicks New-releases option
    Then user is navigated to New-releases page

  @test
  Scenario: open cart page
    Given user is on website
    When user clicks on Cart Page
    Then user navigated to Cart Page

  @test
  Scenario: user is searching for a product
    And user is on website
    When user is searching for shoes
    Then search results are displayed