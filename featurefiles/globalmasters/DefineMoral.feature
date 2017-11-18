Feature: Define Moral
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open fee manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click fee manager logo

  @save @scenario1
  Scenario: To test the validation messages when all fields are left blank
    When user open define moral page
    And click save on define moral page
    Then verify blank field on define moral page

  @save @scenario2
  Scenario: To test moral field with numeric value
    When user open define moral page
    And enter moral as "12345"
    And click save on define moral page
    Then verify numeric data on define moral page

  @save @scenario3
  Scenario: To test moral field with alphanumeric value
    When user open define moral page
    And enter moral as "abc123"
    And click save on define moral page
    Then verify alphanumeric data on define moral page

  @save @scenario4
  Scenario: To test moral field with less than 100 characters
    When user open define moral page
    And enter "99" characters in moral
    And click save on define moral page
    Then verify the saved value on define moral page

  @save @scenario5
  Scenario: To test moral field with 100 characters
    When user open define moral page
    And enter "100" characters in moral
    And click save on define moral page
    Then verify the saved value on define moral page

  @save @scenario6
  Scenario: To test moral field with more than 100 characters
    When user open define moral page
    And enter "101" characters in moral
    And click save on define moral page
    Then verify character length on define moral page

  @save @scenario7
  Scenario: To test moral field with duplicate value
    When user open define moral page
    And enter moral as "good"
    And click save on define moral page
    Then verify duplicate value on define moral page

  @save @scenario8
  Scenario: To test moral field with valid data
    When user open define moral page
    And enter moral as "excellent"
    And click save on define moral page
    Then verify save message on define moral page

  @cancel @scenario9
  Scenario: To test the cancel button on define moral
    When user open define moral page
    And click cancel on define moral page
    Then verify cancel on define moral page

  @delete @scenario10
  Scenario: To test delete button when yes is clicked
    When user open define moral page
    And select record on define moral page
    And delete record on define moral page
    Then verify delete message on define moral page

  @modify @scenario11
  Scenario: To test modify button when yes is clicked
    When user open define moral page
    And select record on define moral page
    And modify record on define moral page
    Then verify modify message on define moral page