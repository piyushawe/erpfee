Feature: Define Mother Tongue
  As a user I want to run test cases of this page
  So that I don't have to do it myself

 Background: Steps to open fee manager home page
  Given for url
  When user enter username and password
  And click sign in to open erp home page
  Then user click fee manager logo

  @save @scenario1
  Scenario: To test the validation messages when all fields are left blank
   When user open define mother tongue page
   And click save on define mother tongue page
   Then verify blank field on define mother tongue page

  @save @scenario2
  Scenario: To test mother tongue field with numeric value
   When user open define mother tongue page
   And enter mother tongue as "12345"
   And click save on define mother tongue page
   Then verify numeric data on define mother tongue page

  @save @scenario3
  Scenario: To test mother tongue field with alphanumeric value
   When user open define mother tongue page
   And enter mother tongue as "abc123"
   And click save on define mother tongue page
   Then verify alphanumeric data on define mother tongue page

  @save @scenario4
  Scenario: To test mother tongue field with less than 100 characters
   When user open define mother tongue page
   And enter "99" characters in mother tongue
   And click save on define mother tongue page
   Then verify the saved value on define mother tongue page

  @save @scenario5
  Scenario: To test mother tongue field with 100 characters
   When user open define mother tongue page
   And enter "100" characters in mother tongue
   And click save on define mother tongue page
   Then verify the saved value on define mother tongue page

  @save @scenario6
  Scenario: To test mother tongue field with more than 100 characters
   When user open define mother tongue page
   And enter "101" characters in mother tongue
   And click save on define mother tongue page
   Then verify character length on define mother tongue page

  @save @scenario7
  Scenario: To test mother tongue field with duplicate value
   When user open define mother tongue page
   And enter mother tongue as "japanese"
   And click save on define mother tongue page
   Then verify duplicate value on define mother tongue page

  @save @scenario8
  Scenario: To test mother tongue field with valid data
   When user open define mother tongue page
   And enter mother tongue as "chinese"
   And click save on define mother tongue page
   Then verify save message on define mother tongue page

  @cancel @scenario9
  Scenario: To test the cancel button on define mother tongue
   When user open define mother tongue page
   And click cancel on define mother tongue page
   Then verify cancel on define mother tongue page

  @delete @scenario10
  Scenario: To test delete button when yes is clicked
   When user open define mother tongue page
   And select record on define mother tongue page
   And delete record on define mother tongue page
   Then verify delete message on define mother tongue page

  @modify @scenario11
  Scenario: To test modify button when yes is clicked
   When user open define mother tongue page
   And select record on define mother tongue page
   And modify record on define mother tongue page
   Then verify modify message on define mother tongue page

