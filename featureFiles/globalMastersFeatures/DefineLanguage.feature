Feature: Define Language
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open fee manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo

  @save @scenario1
  Scenario: To test the validation messages when all fields are left blank
    When user open define language page
    And click save on define language page
    Then verify blank field on define language page

  @save @scenario2
  Scenario: To test language field with numeric value
    When user open define language page
    And enter language as "12345"
    And click save on define language page
    Then verify numeric data on define language page

  @save @scenario3
  Scenario: To test language field with alphanumeric value
    When user open define language page
    And enter language as "abc123"
    And click save on define language page
    Then verify alphanumeric data on define language page

  @save @scenario4
  Scenario: To test language field with less than 100 characters
    When user open define language page
    And enter "99" characters in language
    And click save on define language page
    Then verify the saved value on define language page

  @save @scenario5
  Scenario: To test language field with 100 characters
    When user open define language page
    And enter "100" characters in language
    And click save on define language page
    Then verify the saved value on define language page

  @save @scenario6
  Scenario: To test language field with more than 100 characters
    When user open define language page
    And enter "101" characters in language
    And click save on define language page
    Then verify language length on define language page

  @save @scenario7
  Scenario: To test language field with duplicate value
    When user open define language page
    And enter language as "Hindi"
    And click save on define language page
    Then verify duplicate value on define language page

  @save @scenario8
  Scenario: To test language field with valid data
    When user open define language page
    And enter language as "French"
    And click save on define language page
    Then verify save message on define language page

  @cancel @scenario9
  Scenario: To test the cancel button on define language
    When user open define language page
    And click cancel on define language page
    Then verify cancel on define language page

  @delete @scenario10
  Scenario: To test delete button when yes is clicked
    When user open define language page
    And select record on define language page
    And delete record on define language page
    Then verify delete message on define language page

  @modify @scenario11
  Scenario: To test modify button when yes is clicked
    When user open define language page
    And select record on define language page
    And modify record on define language page
    Then verify modify message on define language page