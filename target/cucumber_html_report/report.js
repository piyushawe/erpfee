$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/ChequeReportDateWise.feature");
formatter.feature({
  "line": 1,
  "name": "Cheque Report Date Wise",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "cheque-report-date-wise",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1187643,
  "status": "passed"
});
formatter.before({
  "duration": 4245920302,
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
  "name": "user open cheque report date wise",
  "keyword": "When "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 750603572,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 199074401,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 1153609979,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 321149685,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_cheque_report_date_wise()"
});
formatter.result({
  "duration": 1850302204,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "#test cases of all filters selection"
    }
  ],
  "line": 31,
  "name": "To verify cheque report date wise with filters",
  "description": "",
  "id": "cheque-report-date-wise;to-verify-cheque-report-date-wise-with-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@verify_with_filters"
    },
    {
      "line": 30,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "select entry mode on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "select from date as month \"April\" year \"2017\" and day \"1\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "select to date as month \"March\" year \"2018\" and day \"31\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "select class on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select school with index \"1\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "select fee type with index \"1\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "select cheque bank on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "select user with index \"1\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "click show on cheque report date wise",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.select_entry_mode_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 381978976,
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
  "location": "TestSteps.select_from_date_as_month_year_and_day_on_cheque_report_date_wise(String,String,String)"
});
formatter.result({
  "duration": 1936329751,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March",
      "offset": 25
    },
    {
      "val": "2018",
      "offset": 38
    },
    {
      "val": "31",
      "offset": 53
    }
  ],
  "location": "TestSteps.select_to_date_as_month_year_and_day_on_cheque_report_date_wise(String,String,String)"
});
formatter.result({
  "duration": 2422884611,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_class_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 359802317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    }
  ],
  "location": "TestSteps.select_school_with_index_on_cheque_report_date_wise(int)"
});
formatter.result({
  "duration": 216022500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "TestSteps.select_fee_type_with_index_on_cheque_report_date_wise(int)"
});
formatter.result({
  "duration": 179976816,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_cheque_bank_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 5501271071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "TestSteps.select_user_with_index_on_cheque_report_date_wise(int)"
});
formatter.result({
  "duration": 197988515,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 1369863263,
  "status": "passed"
});
formatter.after({
  "duration": 99117,
  "status": "passed"
});
formatter.after({
  "duration": 6164598,
  "status": "passed"
});
});