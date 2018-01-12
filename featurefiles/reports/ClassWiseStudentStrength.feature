Feature: Class Wise Student Strength
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open class wise student strength

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify class wise student strength with filters
    And select radio button "rdorowwise" on class wise student strength
    And select class with index "1" on class wise student strength
    Then click show on class wise student strength

#test cases on selection of radio buttons/ check box
  @verify_with_no_filters @scenario2
  Scenario: To verify class wise student strength without any filter
    And select date wise on class wise student strength
    And select radio button "rdocolumnwise" on class wise student strength
    And click for section wise on class wise student strength
    And select section with index "1" on class wise student strength
    And click new students on class wise student strength
    Then click show on class wise student strength