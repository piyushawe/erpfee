Feature: Assigned Transport Report
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open assigned transport report

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify assigned transport report with filters
    And select class with index "1" on assigned transport report
    And select section with index "1" on assigned transport report
    And select month on assigned transport report
    And enter search student on assigned transport report
    And select user with index "1" on assigned transport report
    Then click show on assigned transport report

 #test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify assigned transport report without any filter
    Then click show on assigned transport report