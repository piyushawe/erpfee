Feature: Active Inactive Student Details Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open active inactive student details report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify active inactive student details report with filters
    And select class with index "1" on active inactive student details report
    And select section with index "1" on active inactive student details report
    And select user with index "1" on active inactive student details report
    And select from date as month "April" year "2017" and day "1" on active inactive student details report
    Then click show on active inactive student details report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify active inactive student details report with active option
    And select radio button "1" on active inactive student details report
    And click show on active inactive student details report

  @verify_with_no_filters @scenario3
  Scenario: To verify inactive inactive student details report with active option
    And select radio button "0" on active inactive student details report
    And click show on active inactive student details report