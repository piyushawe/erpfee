Feature: Daily Fee Collection List With Head Fine Filter
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open daily fee collection list with head fine filter

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify daily fee collection list with head fine filter with filters
    And select school with index "1" on daily fee collection list with head fine filter
    And select wing with index "1" on daily fee collection list with head fine filter
    And select class on daily fee collection list with head fine filter
    And select board with index "1" on daily fee collection list with head fine filter
    #And select entry mode on daily fee collection list with head fine filter
    #And select fee type on daily fee collection list with head fine filter
    And select installment on daily fee collection list with head fine filter
    And select pay mode on daily fee collection list with head fine filter
    And select head on daily fee collection list with head fine filter
    And select collection with index "1" on daily fee collection list with head fine filter
    And select head fine on daily fee collection list with head fine filter
    And select user with index "1" on daily fee collection list with head fine filter
    And select status on daily fee collection list with head fine filter
    Then click show on daily fee collection list with head fine filter

  #test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify daily fee collection list with head fine filter with settlement date and cheque clearance date
    And select from date as month "April" year "2017" and day "1" on daily fee collection list with head fine filter
    And click receipt no range on daily fee collection list with head fine filter
    And enter value "1" in receipt from on daily fee collection list with head fine filter
    And enter value "100" in receipt to on daily fee collection list with head fine filter
    And click settlement date on daily fee collection list with head fine filter
    And click cheque clearance date on daily fee collection list with head fine filter
    Then click show on daily fee collection list with head fine filter