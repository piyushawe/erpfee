Feature: Category Wise Student Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open category wise student report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify category wise student report with filters
    And select category with index "1" on category wise student report
    And select class with index "1" on category wise student report
    And select section with index "1" on category wise student report
    And select father profession with index "1" on category wise student report
    Then click show on category wise student report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify category wise student report with active option
    And click show on category wise student report