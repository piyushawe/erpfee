Feature: Fee Defaulter List With Head Fine Filter
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    And user open fee defaulter list with head fine filter

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify fee defaulter list with head fine filter with filters
    And select school with index "1" on fee defaulter list with head fine filter
    And select wing with index "1" fee defaulter list with head fine filter
    And select class with index "1" on fee defaulter list with head fine filter
    And select section with index "1" on fee defaulter list with head fine filter
    And select board with index "1" on fee defaulter list with head fine filter
    And select fee type with index "1" on fee defaulter list with head fine filter
    And select installment on fee defaulter list with head fine filter
    And select till date as month "April" year "2017" and day "30" on fee defaulter list with head fine filter
    And select range with index "1" on fee defaulter list with head fine filter
    And enter range value "1000" on fee defaulter list with head fine filter
    And select status on fee defaulter list with head fine filter
    And click show on fee defaulter list with head fine filter

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify fee defaulter list with head fine filter class wise and without head
    And select radio button "1" on fee defaulter list with head fine filter
    And select date range on fee defaulter list with head fine filter
    And select from date as month "April" year "2017" and day "1" on fee defaulter list with head fine filter
    And select radio button "1" head or headwise on fee defaulter list with head fine filter
    And click with fine on fee defaulter list with head fine filter
    And click header with class group on fee defaulter list with head fine filter
    And select select cheque clearance date on fee defaulter list with head fine filter
    And click show on fee defaulter list with head fine filter

  @verify_with_no_filters @scenario3
  Scenario: To verify fee defaulter list with head fine filter with class range and with head
    And select radio button "2" on fee defaulter list with head fine filter
    And select class on fee defaulter list with head fine filter
    And select radio button "2" head or headwise on fee defaulter list with head fine filter
    And select head on fee defaulter list with head fine filter
    And click show on fee defaulter list with head fine filter