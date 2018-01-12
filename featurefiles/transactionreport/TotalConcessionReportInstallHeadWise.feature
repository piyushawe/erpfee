Feature: Total Concession Report Install Head Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open total concession report install head wise

  #test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify total concession report install head wise with filters
    And select school with index "1" on total concession report install head wise
    And select wing with index "1" on total concession report install head wise
    And select class on total concession report install head wise
    And select board with index "1" on total concession report install head wise
    And select fee type with index "1" on total concession report install head wise
    And select installment on total concession report install head wise
    And select concession on total concession report install head wise
    And select head on total concession report install head wise
    And select student status with index "1" on total concession report install head wise
    And click show on total concession report install head wise

  #test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify total concession report install head wise for active students with head wise and entry time
    And click head wise on total concession report install head wise
    And click entry time on total concession report install head wise
    And select radio button "1" on total concession report install head wise
    And click show on total concession report install head wise

  @verify_with_no_filters @scenario3
  Scenario: To verify total concession report install head wise for inactive students
    And select radio button "0" on total concession report install head wise
    And click show on total concession report install head wise