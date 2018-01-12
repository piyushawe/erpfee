Feature: Student Amount Fee Type Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open student amount fee type wise

  @verify_with_filters @scenario1
  Scenario: To verify student amount fee type wise with filters
    And select class with index "1" on student amount fee type wise
    And select section with index "1" on student amount fee type wise
    And select fee type with index "1" on student amount fee type wise
    And select concession on student amount fee type wise
    And select installment on student amount fee type wise
    Then click show on student amount fee type wise

  @verify_with_no_filters @scenario2
  Scenario: To verify student amount fee type wise without selecting any filter
    Then click show on student amount fee type wise
