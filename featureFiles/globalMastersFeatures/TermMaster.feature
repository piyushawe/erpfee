Feature: Term Master
  As a user I want to run test cases of this page
  So that I don't have to do it myself

 Background: Steps to open fee manager home page
  Given for url
  When user enter username and password
  And click sign in to open erp home page
  Then user click fee manager logo

  @save @scenario1
  Scenario: To test the validation messages when all fields are left blank
   When user open define term master page
   And click save on define term master page
   Then verify blank field on define term master page

  @save @scenario2
  Scenario: To test term master field with numeric value
   When user open define term master page
   And enter term master as "12345"
   And click save on define term master page
   Then verify save message on define term master page

  @save @scenario3
  Scenario: To test term master field with alphanumeric value
   When user open define term master page
   And enter term master as "abc123"
   And click save on define term master page
   Then verify save message on define term master page

  @save @scenario4
  Scenario: To test term master field with less than 100 characters
   When user open define term master page
   And enter "99" characters in term master
   And click save on define term master page
   Then verify the saved value on define term master page

  @save @scenario5
  Scenario: To test term master field with 100 characters
   When user open define term master page
   And enter "100" characters in term master
   And click save on define term master page
   Then verify the saved value on define term master page

  @save @scenario6
  Scenario: To test term master field with more than 100 characters
   When user open define term master page
   And enter "101" characters in term master
   And click save on define term master page
   Then verify character length on define term master page

  @save @scenario7
  Scenario: To test term master field with duplicate value
   When user open define term master page
   And enter term master as "First"
   And click save on define term master page
   Then verify duplicate value on define term master page

  @save @scenario8
  Scenario: To test term master field with valid data
   When user open define term master page
   And enter term master as "Final"
   And click save on define term master page
   Then verify save message on define term master page

  @cancel @scenario9
  Scenario: To test the cancel button on define term master
   When user open define term master page
   And click cancel on define term master page
   Then verify cancel on define term master page

  @delete @scenario10
  Scenario: To test delete button when yes is clicked
   When user open define term master page
   And select record on define term master page
   And delete record on define term master page
   Then verify delete message on define term master page

  @modify @scenario11
  Scenario: To test modify button when yes is clicked
   When user open define term master page
   And select record on define term master page
   And modify record on define term master page
   Then verify modify message on define term master page

