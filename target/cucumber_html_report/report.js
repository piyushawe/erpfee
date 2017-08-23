$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/transactionReportsFeatures/ChequeReportDateWise");
formatter.feature({
  "line": 1,
  "name": "Cheque Report Date Wise",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "cheque-report-date-wise",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1058908,
  "status": "passed"
});
formatter.before({
  "duration": 4219006855,
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
  "duration": 1241835104,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 167736474,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 1447317203,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 313490416,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_cheque_report_date_wise()"
});
formatter.result({
  "duration": 2519568976,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To test client side validations on mandatory fields",
  "description": "",
  "id": "cheque-report-date-wise;to-test-client-side-validations-on-mandatory-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@validation"
    },
    {
      "line": 12,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "verify validation when no entry mode is selected on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify validation when no date from is selected on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select from date as month \"July\" year \"2017\" and day \"1\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verify validation when no date to is selected on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select to date as month \"August\" year \"2017\" and day \"1\" on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify validation when no class is selected on cheque report date wise",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "verify validation when no cheque bank is selected on cheque report date wise",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.verify_validation_when_no_entry_mode_is_selected_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 379618353,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_validation_when_no_date_from_is_selected_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 277029498,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "July",
      "offset": 27
    },
    {
      "val": "2017",
      "offset": 39
    },
    {
      "val": "1",
      "offset": 54
    }
  ],
  "location": "TestSteps.select_from_date_as_month_year_and_day_on_cheque_report_date_wise(String,String,String)"
});
formatter.result({
  "duration": 840247417,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_validation_when_no_date_to_is_selected_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 50352633062,
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
      "val": "1",
      "offset": 54
    }
  ],
  "location": "TestSteps.select_to_date_as_month_year_and_day_on_cheque_report_date_wise(String,String,String)"
});
formatter.result({
  "duration": 50809071361,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_validation_when_no_class_is_selected_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 367008815,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.verify_validation_when_no_cheque_bank_is_selected_on_cheque_report_date_wise()"
});
formatter.result({
  "duration": 352257709,
  "status": "passed"
});
formatter.after({
  "duration": 65394,
  "status": "passed"
});
formatter.after({
  "duration": 1601118,
  "status": "passed"
});
});