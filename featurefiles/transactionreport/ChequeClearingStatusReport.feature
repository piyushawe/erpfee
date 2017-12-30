Feature: Cheque Clearing Status Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open cheque clearing status report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify cheque clearing status report with filters
    And select entry mode on cheque clearing status report
    And select class on cheque clearing status report
    And select school with index "1" on cheque clearing status report
    And select fee type with index "1" on cheque clearing status report
    And select bank name on cheque clearing status report
    And select head on cheque clearing status report
    And select cheque details on cheque clearing status report
    And select user with index "1" on cheque clearing status report
    And select clearing status with index "1" on cheque clearing status report
    And click show on cheque clearing status report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify cheque clearing status report headwise with receipt range
    And select from date as month "April" year "2017" and day "1" on cheque clearing status report
    And click receipt no range on cheque clearing status report
    And enter value "1" in receipt from on cheque clearing status report
    And enter value "100" in receipt to on cheque clearing status report
    And select radio button "1" on cheque clearing status report
    And click show on cheque clearing status report

  @verify_with_no_filters @scenario3
  Scenario: To verify cheque clearing status report without head total amount
    And select from date as month "April" year "2017" and day "1" on cheque clearing status report
    And select radio button "2" on cheque clearing status report
    And click show on cheque clearing status report