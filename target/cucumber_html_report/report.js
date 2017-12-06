$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/ReceiptWiseDailyCollection");
formatter.feature({
  "line": 1,
  "name": "Receipt Wise Daily Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "receipt-wise-daily-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6226179,
  "status": "passed"
});
formatter.before({
  "duration": 4191619232,
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
  "name": "user open receipt wise daily collection",
  "keyword": "When "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 792127074,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 172144534,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 756903649,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 430973190,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_receipt_wise_daily_collection()"
});
formatter.result({
  "duration": 1026379447,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "To verify receipt wise daily collection with head",
  "description": "",
  "id": "receipt-wise-daily-collection;to-verify-receipt-wise-daily-collection-with-head",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@verify_with_no_filters"
    },
    {
      "line": 50,
      "name": "@scenario5"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "select from date as month \"April\" year \"2017\" and day \"1\" on receipt wise daily collection",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "select radio button \"2\" on receipt wise daily collection",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "click show on receipt wise daily collection",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 27
    },
    {
      "val": "2017",
      "offset": 40
    },
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "TestSteps.select_from_date_as_month_year_and_day_on_receipt_wise_daily_collection(String,String,String)"
});
formatter.result({
  "duration": 2128224340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "TestSteps.select_radio_button_on_receipt_wise_daily_collection(String)"
});
formatter.result({
  "duration": 110209708,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_receipt_wise_daily_collection()"
});
formatter.result({
  "duration": 101358838127,
  "status": "passed"
});
formatter.after({
  "duration": 3613366,
  "status": "passed"
});
formatter.after({
  "duration": 7059875,
  "status": "passed"
});
});