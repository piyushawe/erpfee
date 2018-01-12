Feature: Student Strength Ratio Wise Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open student strength ratio wise report

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify student strength ratio wise report with filters
    And select class with index "1" on student strength ratio wise report
    And select section with index "1" on student strength ratio wise report
    Then click show on student strength ratio wise report

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify student strength ratio wise report without any filter and new old syudent status
    And click new old student status on student strength ratio wise report
    Then click show on student strength ratio wise report