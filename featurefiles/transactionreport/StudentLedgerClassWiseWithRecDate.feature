Feature: Student Ledger Class Wise With Rec Date
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open student ledger class wise with rec date

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify student ledger class wise with rec date with filters
    And select school with index "1" on student ledger class wise with rec date
    And select class on student ledger class wise with rec date
    And select fee type with index "1" on student ledger class wise with rec date
    And select installment on student ledger class wise with rec date
    And select head on student ledger class wise with rec date
    And select till date as month "April" year "2017" and day "30" on student ledger class wise with rec date
    Then click show on student ledger class wise with rec date

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify student ledger class wise with rec date with full year paid fee and fine
    And click only full year paid fees on student ledger class wise with rec date
    And click with fine on student ledger class wise with rec date
    Then click show on student ledger class wise with rec date