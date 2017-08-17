Feature: Daily Fee Collection
  As a user I would like to run the test cases of this page
  So that I don't have to do it manually

 Background: Steps to open fee manager landing page
  Given for url
  When user enter username and password
  And click sign in to open erp home page
  Then user click fee manager logo
  When user open daily fee collection report

 @validation
 Scenario: To test the validations on mandatory fields
  And verify validation when no class is selected on daily fee collection
  And select from date as month "April" year "2017" and day "1" on daily fee collection
  And select to date as month "March" year "2018" and day "31" on daily fee collection
