Feature: Uploaded Excel Details
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open uploaded excel details

 #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify uploaded excel details with filters
    And select school with index "1" on uploaded excel details
    And select radio button "1" on uploaded excel details
    And select class with index "1" on uploaded excel details
    And select section with index "1" on uploaded excel details
    And select fee status with index "1" on uploaded excel details
    And select till date as month "April" year "2017" and day "30" on uploaded excel details
    Then click show on uploaded excel details

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify uploaded excel details with full year paid fee and fine for active students
    And select radio button "2" on uploaded excel details
    And select excel name with index "1" on uploaded excel details
    Then click show on uploaded excel details
