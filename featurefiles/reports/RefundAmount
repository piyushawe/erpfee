Feature: Refund Amount
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open refund amount

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify refund amount with filters
    And select from date as month "April" year "2017" and day "1" on refund amount
    And select year with index "2" on refund amount
    Then click show on refund amount