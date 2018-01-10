Feature: Defaulter List Install Head Wise
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

  Background: Steps to open fee manager landing page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo
    And user open defaulter list install head wise

#test cases of all filters selection
  @verify_with_filters @scenario1
  Scenario: To verify fee defaulter installment wise with filters
    And select school with index "1" on defaulter list install head wise
    And select wing with index "1" on defaulter list install head wise
    And select class on defaulter list install head wise
    And select board with index "1" on defaulter list install head wise
    And select fee type with index "1" on defaulter list install head wise
    And select installment on defaulter list install head wise
    And select till date as month "August" year "2017" and day "1" on defaulter list install head wise
    And select fee head on defaulter list install head wise
    And click show on defaulter list install head wise

#test cases on selection of check boxes
  @verify_with_no_filters @scenario2
  Scenario: To verify defaulter list install head wise with date range, fine and cheque clearing date
    And click date range on defaulter list install head wise
    And select from date as month "April" year "2017" and day "1" on defaulter list install head wise
    And click with fine on defaulter list install head wise
    And click check clearing date on defaulter list install head wise
    And click show on defaulter list install head wise