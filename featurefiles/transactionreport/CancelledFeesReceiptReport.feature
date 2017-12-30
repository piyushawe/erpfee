Feature: Cancelled Fees Receipt Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open cancelled fees receipt report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify cancelled fees receipt report with filters
    And select school with index "1" on cancelled fees receipt report
    And select wing with index "1" on cancelled fees receipt report
    And select class on cancelled fees receipt report
    And select board with index "1" on cancelled fees receipt report
    And select user with index "1" on cancelled fees receipt report
    And click show on cancelled fees receipt report

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify fee cancelled fees receipt report without any filter
    And select from date as month "April" year "2017" and day "1" on cancelled fees receipt report
    And click show on cancelled fees receipt report
