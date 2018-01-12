Feature: Class Wise Student Details
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    When user open class wise student details

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify class wise student details with filters
    And select school with index "1" on class wise student details
    And select class with index "1" on class wise student details
    And select section with index "1" on class wise student details
    Then click show on class wise student details

  @verify_with_filters @scenario2
  Scenario: To verify class wise student details when both check boxes are selected
    And select school with index "1" on class wise student details
    And select class with index "1" on class wise student details
    And select section with index "1" on class wise student details
    And select day scholar or boarding on class wise student details
    And select show roll no on class wise student details
    Then click show on class wise student details