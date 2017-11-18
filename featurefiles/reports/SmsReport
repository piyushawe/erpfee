Feature: Sms Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open sms report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify sms report with filters
    And select from date as month "April" year "2017" and day "1" on sms report
    And select sms type with index "1" on sms report
    Then click show on sms report