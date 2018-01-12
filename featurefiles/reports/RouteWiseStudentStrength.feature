Feature: Route Wise Student Strength
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open route wise student strength

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify route wise student strength with filters
    And select school with index "1" on route wise student strength
    And select route on route wise student strength
    And select bus stop on route wise student strength
    And select class on route wise student strength
    And select installment on route wise student strength
    And select month on route wise student strength
    Then click show on route wise student strength

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify route wise student strength without any filter student wise
    And select student wise on route wise student strength
    And select with contact no on route wise student strength
    Then click show on route wise student strength

  @verify_with_no_filters @scenario3
  Scenario: To verify route wise student strength without any filter student wise
    And select route wise summary on route wise student strength
    And select with contact no on route wise student strength
    Then click show on route wise student strength