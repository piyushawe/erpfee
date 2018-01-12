Feature: Student Wise Receipt Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open student wise receipt report

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify student wise receipt report with filters
    And select class with index "1" on student wise receipt report
    And select section with index "1" on student wise receipt report
    And search student on student wise receipt report
    And select fee type with index "1" on student wise receipt report
    And select from date as month "April" year "2017" and day "30" on student wise receipt report
    Then click show on student wise receipt report

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify student wise receipt report without any filter
    Then click show on student wise receipt report