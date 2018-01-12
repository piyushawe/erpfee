Feature: Fees Student Ledger
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open fees student ledger

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify fees student ledger with filters
    And select class with index "1" on fees student ledger
    And select section with index "1" on fees student ledger
    And search student on fees student ledger
    And select fee type with index "1" on fees student ledger
    Then click show on fees student ledger

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify fees student ledger without any filter
    And select radio button "2" on fees student ledger
    Then click show on fees student ledger