Feature: Opening Dues Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open opening dues report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify opening dues report with filters
    And select school with index "1" on opening dues report
    And select class with index "1" on opening dues report
    And select section with index "1" on opening dues report
    And select fee type with index "1" on opening dues report
    And select installment with index "1" on opening dues report
    And select user with index "1" on opening dues report
    Then click show on opening dues report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify opening dues report with no filters
    Then click show on opening dues report