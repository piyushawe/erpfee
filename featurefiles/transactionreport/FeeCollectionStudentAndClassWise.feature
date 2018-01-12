Feature: Fee Collection Student And Class Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open fee collection student and class wise

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify fee collection student and class wise with filters
    And select class with index "1" on fee collection student and class wise
    And select section with index "1" on fee collection student and class wise
    And select fee head on fee collection student and class wise
    And select order by with index "1" on fee collection student and class wise
    And select user with index "1" on fee collection student and class wise
    Then click show on fee collection student and class wise

  #test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify fee collection student and class wise without any filter
    Then click show on fee collection student and class wise