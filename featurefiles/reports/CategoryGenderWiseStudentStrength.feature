Feature: Category Gender Wise Student Strength
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open category gender wise student strength

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify category gender wise student strength with filters category wise
    And select class with index "1" on category gender wise student strength
    Then click show on category gender wise student strength

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify category gender wise student strength without any filter with date range, section wise and gender wise
    And select date range on category gender wise student strength
    And select from date as month "April" year "2017" and day "1" on category gender wise student strength
    And select radio button "rdocolumnwise" on category gender wise student strength
    And click for section wise on category gender wise student strength
    And select section with index "1" on category gender wise student strength
    And select radio button "3" on category gender wise student strength
    Then click show on category gender wise student strength

  @verify_with_no_filters @scenario3
  Scenario: To verify category gender wise student strength without any filter with category and gender wise
    And select radio button "1" on category gender wise student strength
    Then click show on category gender wise student strength