Feature: Transport Report Class Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open transport report class wise

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify transport report class wise with filters class wise
    And select radio button "rbtnClass" on transport report class wise
    And select installment with index "1" on transport report class wise
    And select class on transport report class wise
    And enter stop fare "1000" on transport report class wise
    Then click show on transport report class wise

 #test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify category gender wise student strength without any filter bus stop wise
    And select radio button "rbtnStop" on transport report class wise
    And select installment with index "1" on transport report class wise
    And enter stop fare "1000" on transport report class wise
    And select route with index "1" on transport report class wise
    And select bus stop with index "1" on transport report class wise
    Then click show on transport report class wise