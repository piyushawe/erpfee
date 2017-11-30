$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/FeeCollectionWithEntryTimeConcession");
formatter.feature({
  "line": 1,
  "name": "Fee Collection With Entry Time Concession",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "fee-collection-with-entry-time-concession",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7958671,
  "status": "passed"
});
formatter.before({
  "duration": 4380992500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Steps to open fee manager landing page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "for url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click sign in to open erp home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click fee manager logo",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user open fee collection with entry time concession",
  "keyword": "When "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 1467033243,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 176525908,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 1907941868,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 880704973,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_fee_collection_with_entry_time_concession()"
});
formatter.result({
  "duration": 1495772726,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 62,
      "value": "#test cases on selection of radio buttons"
    }
  ],
  "line": 64,
  "name": "To verify fee collection with entry time concession without head",
  "description": "",
  "id": "fee-collection-with-entry-time-concession;to-verify-fee-collection-with-entry-time-concession-without-head",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 63,
      "name": "@verify_with_no_filters"
    },
    {
      "line": 63,
      "name": "@scenario6"
    }
  ]
});
formatter.step({
  "line": 65,
  "name": "click receipt no range on fee collection with entry time concession",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "enter value \"1\" in receipt from on fee collection with entry time concession",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "enter value \"100\" in receipt to on fee collection with entry time concession",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "select radio button \"2\" on fee collection with entry time concession",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "click show on fee head wise collection class range",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.click_receipt_no_range_on_fee_collection_with_entry_time_concession()"
});
formatter.result({
  "duration": 132412759,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_value_in_receipt_from_on_fee_collection_with_entry_time_concession(String)"
});
formatter.result({
  "duration": 102097376,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_value_in_receipt_to_on_fee_collection_with_entry_time_concession(String)"
});
formatter.result({
  "duration": 86870040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "TestSteps.select_radio_button_on_fee_collection_with_entry_time_concession(String)"
});
formatter.result({
  "duration": 100222368,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_fee_head_wise_collection_class_range()"
});
formatter.result({
  "duration": 2939666586,
  "status": "passed"
});
formatter.after({
  "duration": 4610986,
  "status": "passed"
});
formatter.after({
  "duration": 5780447,
  "status": "passed"
});
});