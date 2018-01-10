Feature: Gender Religion Wise Student Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open gender religion wise student report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify gender religion wise student report with filters
    And select religion with index "1" on gender religion wise student report
    And select class with index "1" on gender religion wise student report
    And select section with index "1" on gender religion wise student report
    And select gender with index "1" on gender religion wise student report
    Then click show on gender religion wise student report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify gender religion wise student report with active option
    And click show on gender religion wise student report