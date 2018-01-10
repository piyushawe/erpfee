Feature: Category Gender Religion Wise Student Strength
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open category gender religion wise student strength

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify category gender religion wise student strength with filters
    And select class with index "1" on category gender religion wise student strength
    And select section with index "1" on category gender religion wise student strength
    Then click show on category gender religion wise student strength

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify category gender religion wise student strength without any filter and new old syudent status
    Then click show on category gender religion wise student strength