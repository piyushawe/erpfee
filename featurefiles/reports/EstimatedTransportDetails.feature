Feature: Estimated Transport Details
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open estimated transport details

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify estimated transport details with filters
    And select school with index "1" on estimated transport details
    And select route with index "1" on estimated transport details
    And select vehicle with index "1" on estimated transport details
    And select class on estimated transport details
    And select installment on estimated transport details
    Then click show on estimated transport details

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify estimated transport details without any filter
    And select vehicle with index "1" on estimated transport details
    Then click show on estimated transport details