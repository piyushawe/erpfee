Feature: Annual Student Ledger1
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open annual student ledger one

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify annual student ledger1 with filters
    And select class with index "1" on annual student ledger one
    And select section with index "1" on annual student ledger one
    And search student on annual student ledger one
    And select fee type with index "1" on annual student ledger one
    Then click show on annual student ledger one

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify annual student ledger1 without any filter
    And select class with index "1" on annual student ledger one
    And select section with index "1" on annual student ledger one
    Then click show on annual student ledger one