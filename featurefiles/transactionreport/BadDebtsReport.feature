Feature: Bad Debts Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open bad debts report

  @validation @scenario1
  Scenario: To test client side validations on mandatory fields
    Then verify validation when no class is selected on bad debts report
    Then verify validation when no installment is selected on bad debts report

  @verify_with_filters @scenario2
  Scenario: To verify bad debts report with filters
    And select fee type with index "1" on bad debts report
    And select class on bad debts report
    And select installment on bad debts report
    And select student status with index "1" on bad debts report
    Then click show on bad debts report

  @verify_with_no_filters @scenario3
  Scenario: To verify bad debts report without selecting any filter
    Then click show on bad debts report