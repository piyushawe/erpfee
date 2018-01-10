Feature: Daily Fee Collection Receipt Range
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open daily fee collection receipt range

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify daily fee collection receipt range with filters
    And select school with index "1" on daily fee collection receipt range
    And select wing with index "1" on daily fee collection receipt range
    And select class on daily fee collection receipt range
    And select board with index "1" on daily fee collection receipt range
    And select entry mode on daily fee collection receipt range
    And select pay mode on daily fee collection receipt range
    And select fee type with index "1" on daily fee collection receipt range
    And select head on daily fee collection receipt range
    And enter value "1" in receipt from on daily fee collection receipt range
    And enter value "100" in receipt to on daily fee collection receipt range
    And select user with index "1" on daily fee collection receipt range
    Then click show on daily fee collection receipt range

  #test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify daily fee collection receipt range without any filter
    And enter value "1" in receipt from on daily fee collection receipt range
    And enter value "100" in receipt to on daily fee collection receipt range
    Then click show on daily fee collection receipt range