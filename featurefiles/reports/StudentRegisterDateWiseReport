Feature: Student Register Date Wise Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open student register date wise report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify student register date wise report with filters
    And select from date as month "April" year "2017" and day "1" on student register date wise report
    And select class with index "1" on student register date wise report
    And select section with index "1" on student register date wise report
    Then click show on student register date wise report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify student register date wise report with no filters
    And select from date as month "April" year "2017" and day "1" on student register date wise report
    And click show on student register date wise report