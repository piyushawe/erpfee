Feature: Transport Detail
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open transport detail

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify transport detail with filters
    And select route with index "1" on transport detail
    And select stop with index "1" on transport detail
    And select vehicle with index "1" on transport detail
    And select class with index "1" on transport detail
    And select section with index "1" on transport detail
    And select vendor with index "1" on transport detail
    And select installment on transport detail
    Then click show on transport detail

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify transport detail with no filters
    Then click show on transport detail