Feature: Amount Without Structure For Staff
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    And user open amount without structure for staff report

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify amount without structure for staff with filters
    And select year with index "3" on amount without structure for staff
    And select school with index "1" on amount without structure for staff
    And select staff type with index "5" on amount without structure for staff
    And select designation with index "1" on amount without structure for staff
    And select department with index "1" on amount without structure for staff
    And select from date as month "April" year "2017" and day "1" on amount without structure for staff
    And select user with index "1" on amount without structure for staff
    And click show on amount without structure for staff

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify amount without structure for staff with cancelled fee
    And click cancelled fee on amount without structure for staff
    And click show on amount without structure for staff