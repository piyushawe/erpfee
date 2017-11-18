Feature: Class Wise Sibling
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open class wise sibling

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify class wise sibling with filters
    And select class with index "1" on class wise sibling
    And select section with index "1" on class wise sibling
    Then click show on class wise sibling

#test cases on selection of radio buttons
  @verify_with_no_filters @scenario2
  Scenario: To verify class wise sibling with no filters
    And click show on class wise sibling