$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/globalmasters/DefineCaste");
formatter.feature({
  "line": 1,
  "name": "Define Caste",
  "description": "As a user I want to run test cases of this page\r\nSo that I don\u0027t have to do it myself",
  "id": "define-caste",
  "keyword": "Feature"
});
formatter.before({
  "duration": 649246,
  "status": "passed"
});
formatter.before({
  "duration": 4945455671,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Steps to open fee manager home page",
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
formatter.match({
  "location": "GenericTestSteps.for_url()"
});
formatter.result({
  "duration": 1198378820,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 205053683,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.click_sign_in_to_open_erp_home_page()"
});
formatter.result({
  "duration": 2636039573,
  "status": "passed"
});
formatter.match({
  "location": "GenericTestSteps.user_click_fee_manager_logo()"
});
formatter.result({
  "duration": 10104765041,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@src\u003d\u0027/Images/NewLayout/erp-serv-icon/Fees.png\u0027]\"}\n  (Session info: chrome\u003d62.0.3202.89)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir5280_9099}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d62.0.3202.89, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 8dcb028fa9d39b60f8ef63b06554a06a\n*** Element info: {Using\u003dxpath, value\u003d//img[@src\u003d\u0027/Images/NewLayout/erp-serv-icon/Fees.png\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:458)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat automationFramework.supportMethods.ReadFile.getElement(ReadFile.java:44)\r\n\tat stepdefinitions.GenericTestSteps.user_click_fee_manager_logo(GenericTestSteps.java:37)\r\n\tat ✽.Then user click fee manager logo(featurefiles/globalmasters/DefineCaste:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 12,
  "name": "To test the validation messages when all fields are left blank",
  "description": "",
  "id": "define-caste;to-test-the-validation-messages-when-all-fields-are-left-blank",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@save"
    },
    {
      "line": 11,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user open define caste page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click save on define caste page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify blank field on define caste page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.user_open_define_caste_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.click_save_on_define_caste_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.verify_blank_field_on_define_caste_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 512654588,
  "status": "passed"
});
formatter.after({
  "duration": 6185436,
  "status": "passed"
});
});