$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/DailyFeeCollection.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 863306,
  "status": "passed"
});
formatter.before({
  "duration": 5649377475,
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
  "name": "user open daily fee collection report",
  "keyword": "When "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 8231077496,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 132598721,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 7286233493,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 2994422233,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_report()"
});
formatter.result({
  "duration": 9164370089,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 79,
      "value": "#test cases on selection of radio buttons/ check box"
    }
  ],
  "line": 81,
  "name": "To verify daily fee collection head wise with receipt no. range, settlement date and cheque clearance date",
  "description": "",
  "id": "daily-fee-collection;to-verify-daily-fee-collection-head-wise-with-receipt-no.-range,-settlement-date-and-cheque-clearance-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 80,
      "name": "@verify_with_no_filters"
    },
    {
      "line": 80,
      "name": "@scenario8"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "select from date as month \"April\" year \"2017\" and day \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "click receipt no range on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "enter value \"1\" in receipt from on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "enter value \"100\" in receipt to on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "select radio button \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "select with settlement date on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "select with cheque clearance date on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "click show on daily fee collection",
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
  "location": "TestSteps.select_from_date_as_month_year_and_day_on_daily_fee_collection(String,String,String)"
});
formatter.result({
  "duration": 2056778800,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_receipt_no_range_on_daily_fee_collection()"
});
formatter.result({
  "duration": 121242023,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_value_in_receipt_from_on_daily_fee_collection(String)"
});
formatter.result({
  "duration": 409917053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 13
    }
  ],
  "location": "TestSteps.enter_value_in_receipt_to_on_daily_fee_collection(String)"
});
formatter.result({
  "duration": 310652389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "TestSteps.select_radio_button_on_daily_fee_collection(String)"
});
formatter.result({
  "duration": 192897607,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_with_settlement_date_on_daily_fee_collection()"
});
formatter.result({
  "duration": 77165611,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_with_cheque_clearance_date_on_daily_fee_collection()"
});
formatter.result({
  "duration": 82303514,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_daily_fee_collection()"
});
formatter.result({
  "duration": 16087461944,
  "status": "passed"
});
formatter.after({
  "duration": 357723394,
  "status": "passed"
});
formatter.after({
  "duration": 3759664,
  "status": "passed"
});
});