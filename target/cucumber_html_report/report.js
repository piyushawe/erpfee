$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/transactionReportsFeatures/DailyFeeCollectionDateWiseWithRemark.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection Date Wise With Remark",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection-date-wise-with-remark",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5618576,
  "status": "passed"
});
formatter.before({
  "duration": 3930516754,
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
  "name": "user open daily fee collection date wise with remark",
  "keyword": "And "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 1720411939,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 185265491,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 1659691149,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 300661824,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_date_wise_with_remark()"
});
formatter.result({
  "duration": 981411488,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "To test alert validation for invalid receipt range",
  "description": "",
  "id": "daily-fee-collection-date-wise-with-remark;to-test-alert-validation-for-invalid-receipt-range",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@validation"
    },
    {
      "line": 51,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "click receipt no range on daily fee collection date wise with remark",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "enter character \"5\" in receipt from on daily fee collection date wise with remark",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "enter character \"1\" in receipt to on daily fee collection date wise with remark",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "click show on daily fee collection date wise with remark",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "verify alert message for invalid receipt range on daily fee collection date wise with remark",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.click_receipt_no_range_on_daily_fee_collection_date_wise_with_remark()"
});
formatter.result({
  "duration": 118512063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "TestSteps.enter_character_in_receipt_from_on_daily_fee_collection_date_wise_with_remark(String)"
});
formatter.result({
  "duration": 113327196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "TestSteps.enter_character_in_receipt_to_on_daily_fee_collection_date_wise_with_remark(String)"
});
formatter.result({
  "duration": 80740045,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_daily_fee_collection_date_wise_with_remark()"
});
formatter.result({
  "duration": 105001969,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_alert_message_for_invalid_receipt_range_on_daily_fee_collection_date_wise_with_remark()"
});
formatter.result({
  "duration": 59105890,
  "status": "passed"
});
formatter.after({
  "duration": 63341,
  "status": "passed"
});
formatter.after({
  "duration": 14910926,
  "status": "passed"
});
});