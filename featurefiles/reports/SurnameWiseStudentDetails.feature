Feature: Surname Wise Student Details
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open surname wise student details

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify surname wise student details with filters
    And select class with index "1" on surname wise student details
    And select section with index "1" on surname wise student details
    And select student details on surname wise student details
    Then click show on surname wise student details

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify surname wise student details with active option
    And select class with index "1" on surname wise student details
    And select section with index "1" on surname wise student details
    And click show on surname wise student details