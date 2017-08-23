Feature: Daily Fee Collection Account Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    And user open daily fee collection account wise

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
    And enter character "a" in receipt from on daily fee collection account wise
    Then verify numeric validation for receipt from on daily fee collection account wise
    And enter "101" digits in receipt from on daily fee collection account wise
    Then verify length validation on receipt from on daily fee collection account wise
    And enter character "a" in receipt to on daily fee collection account wise
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
    And enter character "1" in receipt from on daily fee collection account wise
    And click show on daily fee collection account wise
    Then verify alert message for blank receipt to on daily fee collection account wise

  @validation @scenario5
  Scenario: To test alert validation for invalid receipt range
    And click receipt no range on daily fee collection account wise
    And enter character "5" in receipt from on daily fee collection account wise
    And enter character "1" in receipt to on daily fee collection account wise
    And click show on daily fee collection account wise
    Then verify alert message for invalid receipt range on daily fee collection account wise