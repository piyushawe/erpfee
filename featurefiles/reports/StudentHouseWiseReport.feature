Feature: Student House Wise Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open student house wise report

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify student house wise report with filters
    And select class with index "1" on student house wise report
    And click for section wise on student house wise report
    And select section with index "1" on student house wise report
    And select house with index "1" on student house wise report
    And select range type with index "1" on student house wise report
    And select from age with index "1" on student house wise report
    Then click show on student house wise report

 #test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify student house wise report with active option
    And select radio button "1" on student house wise report
    And click show on student house wise report

  @verify_with_no_filters @scenario3
  Scenario: To verify student house wise report with inactive option
    And select radio button "0" on student house wise report
    And click show on student house wise report