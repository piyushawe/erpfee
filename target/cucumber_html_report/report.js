$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/transactionReportsFeatures/AdvancePaymentReport");
formatter.feature({
  "line": 1,
  "name": "Advance Payment Report",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "advance-payment-report",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1079438,
  "status": "passed"
});
formatter.before({
  "duration": 4566141473,
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
  "name": "user open advance payment report",
  "keyword": "When "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 12025628521,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 162391972,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 20709705590,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 7534150102,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_advance_payment_report()"
});
formatter.result({
  "duration": 54840821711,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "To verify advance payment report without selecting any filter",
  "description": "",
  "id": "advance-payment-report;to-verify-advance-payment-report-without-selecting-any-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@verify_with_no_filters"
    },
    {
      "line": 28,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "select installment with index \"1\" on advance payment report",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click show on advance payment report",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "TestSteps.select_installment_with_index_on_advance_payment_report(int)"
});
formatter.result({
  "duration": 210876081,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_advance_payment_report()"
});
formatter.result({
  "duration": 87617114360,
  "status": "passed"
});
formatter.after({
  "duration": 138706,
  "status": "passed"
});
formatter.after({
  "duration": 11321346,
  "status": "passed"
});
});