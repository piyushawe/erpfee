Feature: Paid Transport
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open paid transport

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify paid transport with filters
    And select school with index "1" on paid transport
    And select class on paid transport
    And select route with index "1" on paid transport
    And select vehicle with index "1" on paid transport
    And select pay mode on paid transport
    And select installment on paid transport
    And select user with index "1" on paid transport
    Then click show on paid transport

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify paid transport with no filters
    And select from date as month "April" year "2017" and day "1" on paid transport
    Then click show on paid transport