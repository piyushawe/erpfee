Feature: PTA Daily Fee Collection Date Fee Group Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open pta daily fee collection date fee group wise

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify pta daily fee collection date fee group wise with filters
    And select school with index "1" on pta daily fee collection date fee group wise
    And select wing with index "1" on pta daily fee collection date fee group wise
    #And select class on pta daily fee collection date fee group wise
    And select board with index "1" on pta daily fee collection date fee group wise
    And select entry mode on pta daily fee collection date fee group wise
    And select pay mode on pta daily fee collection date fee group wise
    And select fee type with index "1" on pta daily fee collection date fee group wise
    And select head on pta daily fee collection date fee group wise
    And select fee group on pta daily fee collection date fee group wise
    And select user with index "1" on pta daily fee collection date fee group wise
    Then click show on pta daily fee collection date fee group wise

  #test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify pta daily fee collection date fee group wise with full details
    And select from date as month "April" year "2017" and day "1" on pta daily fee collection date fee group wise
    And select radio button "1" on pta daily fee collection date fee group wise
    Then click show on pta daily fee collection date fee group wise

  @verify_with_no_filters @scenario3
  Scenario: To verify pta daily fee collection date fee group wise with summary
    And select from date as month "April" year "2017" and day "1" on pta daily fee collection date fee group wise
    And select radio button "2" on pta daily fee collection date fee group wise
    Then click show on pta daily fee collection date fee group wise

  @verify_with_no_filters @scenario4
  Scenario: To verify pta daily fee collection date fee group wise with separated
    And select from date as month "April" year "2017" and day "1" on pta daily fee collection date fee group wise
    And select radio button "3" on pta daily fee collection date fee group wise
    Then click show on pta daily fee collection date fee group wise