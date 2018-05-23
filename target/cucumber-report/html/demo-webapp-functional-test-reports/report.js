$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample-webapp-functional-test.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the web site pages",
  "description": "Navigate to the Test page.\r\nEnter the values in two text boxes. \r\nHit concatenate button to populate the result in the third textbox.\r\nValidate the result populated is as expected.",
  "id": "validate-the-web-site-pages",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1993299513,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Concatenate two numbers in home apge and navigate to about page",
  "description": "",
  "id": "validate-the-web-site-pages;concatenate-two-numbers-in-home-apge-and-navigate-to-about-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@FUNCTIONAL"
    },
    {
      "line": 7,
      "name": "@REGRESSION"
    },
    {
      "line": 7,
      "name": "@STAGE"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am using app url to navigate to the Test page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I have entered \"222\" into the first text box",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Then I have entered \"333\" into the second text box",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I press concatenate button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the result should be \"222333\" on the third text box",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoWebAppFunctionalTestSteps.i_am_using_app_url_to_navigate_to_the_Test_page()"
});
formatter.result({
  "duration": 770145142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 16
    }
  ],
  "location": "DemoWebAppFunctionalTestSteps.i_have_entered_something_into_the_first_text_box(String)"
});
formatter.result({
  "duration": 79521495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "333",
      "offset": 21
    }
  ],
  "location": "DemoWebAppFunctionalTestSteps.then_i_have_entered_something_into_the_second_text_box(String)"
});
formatter.result({
  "duration": 77073639,
  "status": "passed"
});
formatter.match({
  "location": "DemoWebAppFunctionalTestSteps.i_press_concatenate_button()"
});
formatter.result({
  "duration": 119628991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222333",
      "offset": 22
    }
  ],
  "location": "DemoWebAppFunctionalTestSteps.the_result_should_be_something_on_the_third_text_box(String)"
});
formatter.result({
  "duration": 28040180,
  "status": "passed"
});
formatter.after({
  "duration": 156146412,
  "status": "passed"
});
});