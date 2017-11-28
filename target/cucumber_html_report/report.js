$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/DailyFeeCollection.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6887428,
  "status": "passed"
});
formatter.before({
  "duration": 4687756112,
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
  "duration": 1783788634,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 188322953,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 693834773,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 332422321,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_report()"
});
formatter.result({
  "duration": 1036232972,
  "status": "passed"
});
formatter.scenario({
  "line": 99,
  "name": "To verify daily fee collection with head(one line data) with cheque clearance date",
  "description": "",
  "id": "daily-fee-collection;to-verify-daily-fee-collection-with-head(one-line-data)-with-cheque-clearance-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 98,
      "name": "@verify_with_no_filters"
    },
    {
      "line": 98,
      "name": "@scenario10"
    }
  ]
});
formatter.step({
  "line": 100,
  "name": "select from date as month \"April\" year \"2017\" and day \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "select radio button \"3\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "select with cheque clearance date on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 103,
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
  "duration": 2074340068,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "TestSteps.select_radio_button_on_daily_fee_collection(String)"
});
formatter.result({
  "duration": 140562548,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_with_cheque_clearance_date_on_daily_fee_collection()"
});
formatter.result({
  "duration": 86690052,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_daily_fee_collection()"
});
formatter.result({
  "duration": 83709793128,
  "status": "passed"
});
formatter.after({
  "duration": 194714,
  "status": "passed"
});
formatter.after({
  "duration": 10023090,
  "status": "passed"
});
});