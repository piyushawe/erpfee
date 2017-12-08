$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/DailyFeeCollection.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7219088,
  "status": "passed"
});
formatter.before({
  "duration": 4515544001,
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
  "duration": 6325705560,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 168857690,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 15887488321,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 3852155316,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_report()"
});
formatter.result({
  "duration": 7949588667,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 64,
      "value": "#test cases of all filters selection"
    }
  ],
  "line": 66,
  "name": "To verify daily fee collection with filters",
  "description": "",
  "id": "daily-fee-collection;to-verify-daily-fee-collection-with-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 65,
      "name": "@verify_with_filters"
    },
    {
      "line": 65,
      "name": "@scenario7"
    }
  ]
});
formatter.step({
  "line": 67,
  "name": "select school with index \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "select wing with index \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "select class on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "select board with index \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 71,
      "value": "#And select entry mode on daily fee collection"
    },
    {
      "line": 72,
      "value": "#And select fee type on daily fee collection"
    }
  ],
  "line": 73,
  "name": "select pay mode on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "select head on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "select from date as month \"April\" year \"2017\" and day \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "select user with index \"1\" on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "click show on daily fee collection",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "TestSteps.select_school_with_index_on_daily_fee_collection(int)"
});
formatter.result({
  "duration": 1275512694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "TestSteps.select_wing_with_index_on_daily_fee_collection(int)"
});
formatter.result({
  "duration": 447957935,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_class_on_daily_fee_collection()"
});
formatter.result({
  "duration": 462704897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 25
    }
  ],
  "location": "TestSteps.select_board_with_index_on_daily_fee_collection(int)"
});
formatter.result({
  "duration": 209442114,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_pay_mode_on_daily_fee_collection()"
});
formatter.result({
  "duration": 454178819,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_head_on_daily_fee_collection()"
});
formatter.result({
  "duration": 396962458,
  "status": "passed"
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
  "duration": 2022421166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "TestSteps.select_user_with_index_on_daily_fee_collection(int)"
});
formatter.result({
  "duration": 229531401,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_daily_fee_collection()"
});
formatter.result({
  "duration": 40947448863,
  "status": "passed"
});
formatter.after({
  "duration": 5425019,
  "status": "passed"
});
formatter.after({
  "duration": 5606244,
  "status": "passed"
});
formatter.before({
  "duration": 121990,
  "status": "passed"
});
formatter.before({
  "duration": 2428063,
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
  "duration": 3299789509,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
