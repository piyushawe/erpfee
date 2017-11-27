Feature: Annual Student Ledger3
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    And user click fee manager logo
    Then user open annual student ledger three

  @validation @scenario1
  Scenario: To test client side validations on mandatory fields
    Then verify validation when no installment is selected on annual student ledger three

  @verify_with_filters @scenario2
  Scenario: To verify annual student ledger 3 with filters
    And select installment on annual student ledger three
    And select class with index "1" on annual student ledger three
    And select section with index "1" on annual student ledger three
    Then click show on annual student ledger three

  @verify_with_no_filters @scenario3
  Scenario: To verify annual student ledger 3 without selecting any filter
    Then click show on annual student ledger three