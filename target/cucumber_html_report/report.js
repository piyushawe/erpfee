$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/transactionreport/DailyFeeCollection.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Fee Collection",
  "description": "As a user I would like to run the test cases of this page\r\nSo that I don\u0027t have to do it manually",
  "id": "daily-fee-collection",
  "keyword": "Feature"
});
formatter.before({
  "duration": 759211,
  "status": "passed"
});
formatter.before({
  "duration": 4027756819,
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
  "duration": 1014015648,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 187102964,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 977884044,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 369668841,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_open_daily_fee_collection_report()"
});
formatter.result({
  "duration": 1168519438,
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
  "line": 71,
  "name": "select entry mode on daily fee collection",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "select fee type on daily fee collection",
  "keyword": "And "
});
formatter.step({
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
  "duration": 419808763,
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
  "duration": 643183503,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_class_on_daily_fee_collection()"
});
formatter.result({
  "duration": 498739486,
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
  "duration": 212526726,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_entry_mode_on_daily_fee_collection()"
});
formatter.result({
  "duration": 147169731,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.select_fee_type_on_daily_fee_collection()"
});
formatter.result({
  "duration": 134824993,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton type\u003d\"button\" class\u003d\"ui-multiselect ui-widget ui-state-default ui-corner-all\" title\u003d\"\" aria-haspopup\u003d\"true\" tabindex\u003d\"0\" style\u003d\"width: 200px;\"\u003e...\u003c/button\u003e is not clickable at point (169, 189). Other element would receive the click: \u003cli\u003e...\u003c/li\u003e\n  (Session info: chrome\u003d62.0.3202.94)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir8828_19348}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d62.0.3202.94, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: dd2ce63403668ac8faffb9f8b994d899\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat utilities.EventHandlingUtility.click(EventHandlingUtility.java:46)\r\n\tat utilities.EventHandlingUtility.selectValue(EventHandlingUtility.java:122)\r\n\tat pageobjects.transactionreport.DailyFeeCollection.selectFeeType(DailyFeeCollection.java:42)\r\n\tat stepdefinitions.TestSteps.select_fee_type_on_daily_fee_collection(TestSteps.java:1285)\r\n\tat ✽.And select fee type on daily fee collection(featurefiles/transactionreport/DailyFeeCollection.feature:72)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.select_pay_mode_on_daily_fee_collection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.select_head_on_daily_fee_collection()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.click_show_on_daily_fee_collection()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 351711392,
  "status": "passed"
});
formatter.after({
  "duration": 2381443,
  "status": "passed"
});
});