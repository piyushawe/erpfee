$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/DailyFeeCollection.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 622847,
  "status": "passed"
});
formatter.before({
  "duration": 4186653299,
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
  "duration": 6506698540,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 135995057,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 4282572653,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 507568004,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_report()"
});
formatter.result({
  "duration": 3311894270,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "To test alert validation when from date is greater than to date",
  "description": "",
  "id": "daily-fee-collection;to-test-alert-validation-when-from-date-is-greater-than-to-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@validation"
    },
    {
      "line": 25,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "select from date as month \"August\" year \"2017\" and day \"10\" on daily fee collection",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "select to date as month \"August\" year \"2017\" and day \"9\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "verify alert message for date on daily fee collection",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "August",
      "offset": 27
    },
    {
      "val": "2017",
      "offset": 41
    },
    {
      "val": "10",
      "offset": 56
    }
  ],
  "location": "TestSteps.select_from_date_as_month_year_and_day_on_daily_fee_collection(String,String,String)"
});
formatter.result({
  "duration": 1985527013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "August",
      "offset": 25
    },
    {
      "val": "2017",
      "offset": 39
    },
    {
      "val": "9",
      "offset": 54
    }
  ],
  "location": "TestSteps.select_to_date_as_month_year_and_day_on_daily_fee_collection(String,String,String)"
});
formatter.result({
  "duration": 1929670460,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_alert_message_for_date_on_daily_fee_collection()"
});
formatter.result({
  "duration": 69785282,
  "status": "passed"
});
formatter.after({
  "duration": 319052908,
  "status": "passed"
});
formatter.after({
  "duration": 2264126,
  "status": "passed"
});
});