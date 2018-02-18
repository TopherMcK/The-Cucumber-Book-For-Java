$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 969544167,
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
      "val": "$100.00",
      "offset": 29
    }
  ],
  "location": "AccountSteps.myAccountHasBeenCredited$(Money)"
});
formatter.result({
  "duration": 100739406,
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
  "duration": 3922840111,
  "status": "passed"
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
  "duration": 1649643,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$80.00",
      "offset": 36
    }
  ],
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "duration": 159590,
  "status": "passed"
});
formatter.after({
  "duration": 112800139,
  "status": "passed"
});
formatter.after({
  "duration": 13446991,
  "status": "passed"
});
});