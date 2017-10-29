Feature: Advance Payment Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open advance payment report

  @validation @scenario1
  Scenario: To test client side validations on mandatory fields
    And select installment "Select installment" on advance payment report
    And verify validation when no class is selected on advance payment report
    And verify validation when no till date is selected on advance payment report
    And click show on advance payment report
    And verify validation when no installment is selected on advance payment report

  @verify_with_filters @scenario2
  Scenario: To verify advance payment report with filters
    And select school with index "1" on advance payment report
    And select installment with index "1" on advance payment report
    And select class on advance payment report
    And select fee type with index "1" on advance payment report
    Then click show on advance payment report

  @verify_with_no_filters @scenario3
  Scenario: To verify advance payment report without selecting any filter
    And select installment with index "1" on advance payment report
    Then click show on advance payment report