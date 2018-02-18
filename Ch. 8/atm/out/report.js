$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 990915271,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-an-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "my account has been credited $100.00",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I withdraw $20",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "$20 should be dispensed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the balance of my account should be $80.00",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "100.00",
      "offset": 30
    }
  ],
  "location": "AccountSteps.myAccountHasBeenCredited$(Money)"
});
formatter.result({
  "duration": 104009154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 12
    }
  ],
  "location": "AccountSteps.iWithdraw$(int)"
});
formatter.result({
  "duration": 3633625395,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: #Amount\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027DESKTOP-5ADRVQO\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 58.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:headless: false, moz:processID: 18496, moz:profile: C:\\Users\\topher\\AppData\\Loc..., moz:webdriverClick: true, pageLoadStrategy: normal, platform: XP, platformName: XP, platformVersion: 10.0, rotatable: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}}\nSession ID: f8f2c378-2ef3-4f0b-8822-a1e2b169f2c0\n*** Element info: {Using\u003did, value\u003dAmount}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:108)\r\n\tat com.sun.proxy.$Proxy32.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:192)\r\n\tat clm.cuc_for_java_bk.atm.support.AtmUserInterface.withdrawFrom(AtmUserInterface.java:34)\r\n\tat clm.cuc_for_java_bk.atm.nicebank.AccountSteps.iWithdraw$(AccountSteps.java:58)\r\n\tat ✽.When I withdraw $20(cash_withdrawal.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 1
    }
  ],
  "location": "AccountSteps.$ShouldBeDispensed(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "80",
      "offset": 37
    },
    {
      "val": "00",
      "offset": 40
    }
  ],
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2825878760,
  "status": "passed"
});
});