Feature: Print Transport Id Card
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open print transport id card

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify print transport id card with filters
    And select school with index "1" on print transport id card
    And select class with index "1" on print transport id card
    And select section with index "1" on print transport id card
    And search student on print transport id card
    Then click show on print transport id card

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify print transport id card without any filter
    Then click show on print transport id card