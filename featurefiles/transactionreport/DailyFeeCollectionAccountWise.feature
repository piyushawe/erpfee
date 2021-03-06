Feature: Daily Fee Collection Account Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    And user open daily fee collection account wise

#validation message verification test cases
  @validation @scenario1
  Scenario: To test client side validations on mandatory fields
    And verify validation when no class is selected on daily fee collection account wise
    And verify validation when no entry mode is selected on daily fee collection account wise
    #And verify validation when no pay mode is selected on daily fee collection account wise
    And verify validation when no head is selected on daily fee collection account wise
    And verify validation when no bank name is selected on daily fee collection account wise
    And verify validation when no date from is selected on daily fee collection account wise
    And select from date as month "April" year "2017" and day "1" on daily fee collection account wise
    And verify validation when no date to is selected on daily fee collection account wise
    And click receipt no range on daily fee collection account wise
    And enter value "a" in receipt from on daily fee collection account wise
    Then verify numeric validation for receipt from on daily fee collection account wise
    And enter "101" digits in receipt from on daily fee collection account wise
    Then verify length validation on receipt from on daily fee collection account wise
    And enter value "a" in receipt to on daily fee collection account wise
    Then verify numeric validation for receipt to on daily fee collection account wise
    And enter "101" digits in receipt to on daily fee collection account wise
    Then verify length validation on receipt to on daily fee collection account wise

  @validation @scenario2
  Scenario: To test alert validation when from date is greater than to date
    When select from date as month "August" year "2017" and day "20" on daily fee collection account wise
    And select to date as month "August" year "2017" and day "10" on daily fee collection account wise
    And click show on daily fee collection account wise
    Then verify alert message for account on daily fee collection account wise

  @validation @scenario3
  Scenario: To test alert validation when receipt from is left blank
    And click receipt no range on daily fee collection account wise
    And click show on daily fee collection account wise
    Then verify alert message for blank receipt from on daily fee collection account wise

  @validation @scenario4
  Scenario: To test alert validation when receipt to is left blank
    And click receipt no range on daily fee collection account wise
    And enter value "1" in receipt from on daily fee collection account wise
    And click show on daily fee collection account wise
    Then verify alert message for blank receipt to on daily fee collection account wise

  @validation @scenario5
  Scenario: To test alert validation for invalid receipt range
    And click receipt no range on daily fee collection account wise
    And enter value "5" in receipt from on daily fee collection account wise
    And enter value "1" in receipt to on daily fee collection account wise
    And click show on daily fee collection account wise
    Then verify alert message for invalid receipt range on daily fee collection account wise

#test cases of all filters selection
  @verify_with_filters @scenario6
  Scenario: To verify daily fee collection account wise with filters
    And select school with index "1" on daily fee collection account wise
    And select wing with index "1" on daily fee collection account wise
    And select class on daily fee collection account wise
    And select board with index "1" on daily fee collection account wise
    And select entry mode on daily fee collection account wise
    And select fee type with index "1" on daily fee collection account wise
    And select pay mode on daily fee collection account wise
    And select head on daily fee collection account wise
    And select bank name on daily fee collection account wise
    And select cheque details on daily fee collection account wise
    And select from date as month "April" year "2017" and day "1" on daily fee collection account wise
    And select user with index "1" on daily fee collection account wise
    Then click show on daily fee collection account wise

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario7
  Scenario: To verify daily fee collection account wise head wise and receipt range
    And select from date as month "April" year "2017" and day "1" on daily fee collection account wise
    And click receipt no range on daily fee collection account wise
    And enter value "1" in receipt from on daily fee collection account wise
    And enter value "100" in receipt to on daily fee collection account wise
    And select radio button "1" on daily fee collection account wise
    Then click show on daily fee collection account wise

  @verify_with_no_filters @scenario8
  Scenario: To verify daily fee collection account wise without head total amount and with cheque clearing date
    And select from date as month "April" year "2017" and day "1" on daily fee collection account wise
    And click cheque clearing date on daily fee collection account wise
    And select radio button "2" on daily fee collection account wise
    Then click show on daily fee collection account wise

  @verify_with_no_filters @scenario9
  Scenario: To verify daily fee collection account wise with head one line data
    And select from date as month "April" year "2017" and day "1" on daily fee collection account wise
    And select radio button "3" on daily fee collection account wise
    Then click show on daily fee collection account wise

  @verify_with_no_filters @scenario10
  Scenario: To verify daily fee collection account wise without head one line data
    And select from date as month "April" year "2017" and day "1" on daily fee collection account wise
    And select radio button "4" on daily fee collection account wise
    Then click show on daily fee collection account wise