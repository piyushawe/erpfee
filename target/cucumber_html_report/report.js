$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/DailyFeeCollection.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8578275,
  "status": "passed"
});
formatter.before({
  "duration": 4741174080,
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
  "duration": 1018808103,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 173158118,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 678622139,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 342253043,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_report()"
});
formatter.result({
  "duration": 991518788,
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
  "duration": 2026419551,
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
  "duration": 1467688,
  "error_message": "java.lang.NullPointerException\r\n\tat automationFramework.supportMethods.ReadFile.getElements(ReadFile.java:86)\r\n\tat utilities.GenericReports.clickButton(GenericReports.java:184)\r\n\tat stepdefinitions.TestSteps.select_radio_button_on_daily_fee_collection(TestSteps.java:1300)\r\n\tat ✽.And select radio button \"3\" on daily fee collection(featurefiles/transactionreport/DailyFeeCollection.feature:101)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.select_with_cheque_clearance_date_on_daily_fee_collection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.click_show_on_daily_fee_collection()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 367715739,
  "status": "passed"
});
formatter.after({
  "duration": 18387004,
  "status": "passed"
});
});