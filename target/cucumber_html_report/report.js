$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/FeesConcessionInstallHeadWise");
formatter.feature({
  "line": 1,
  "name": "Fees Concession Install Head Wise",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "fees-concession-install-head-wise",
  "keyword": "Feature"
});
formatter.before({
  "duration": 801432,
  "status": "passed"
});
formatter.before({
  "duration": 4573914723,
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
  "name": "user open fees concession install head wise",
  "keyword": "When "
});
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 1496203975,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 139521006,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 686129861,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 390824615,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_fees_concession_install_head_wise()"
});
formatter.result({
  "duration": 1172109933,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "To verify fees concession install head wise consolidated and assigned",
  "description": "",
  "id": "fees-concession-install-head-wise;to-verify-fees-concession-install-head-wise-consolidated-and-assigned",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@verify_with_no_filters"
    },
    {
      "line": 44,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "select radio button \"3\" on fees concession install head wise",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click show on fees concession install head wise",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "TestSteps.select_radio_button_on_fees_concession_install_head_wise(String)"
});
formatter.result({
  "duration": 43319553,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.click_show_on_fees_concession_install_head_wise()"
});
formatter.result({
  "duration": 4095176864,
  "status": "passed"
});
formatter.after({
  "duration": 333611230,
  "status": "passed"
});
formatter.after({
  "duration": 3617441,
  "status": "passed"
});
});