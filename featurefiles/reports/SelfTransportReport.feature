Feature: Self Transport Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open self transport report

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify self transport report with filters
    And select transport with index "1" on self transport report
    And select class with index "1" on self transport report
    And select section with index "1" on self transport report
    And select additional field on self transport report
    Then click show on self transport report

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify self transport report without any filter for active students
    And select radio button "1" on self transport report
    Then click show on self transport report

  @verify_with_no_filters @scenario3
  Scenario: To verify self transport report without any filter for inactive students
    And select radio button "0" on self transport report
    Then click show on self transport report