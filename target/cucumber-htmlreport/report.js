$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("m2feature.feature");
formatter.feature({
  "line": 1,
  "name": "This is a sample google coordinate BDD implementation",
  "description": "",
  "id": "this-is-a-sample-google-coordinate-bdd-implementation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9294916297,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check google coordinate",
  "description": "",
  "id": "this-is-a-sample-google-coordinate-bdd-implementation;check-google-coordinate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TEST"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "URL details for google",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search anything",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see page coordinate",
  "keyword": "Then "
});
formatter.match({
  "location": "M2class.url_details_for_google()"
});
formatter.result({
  "duration": 13219157458,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_search_anything()"
});
formatter.result({
  "duration": 747156009,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_should_see_page_coordinate()"
});
formatter.result({
  "duration": 212268112,
  "status": "passed"
});
formatter.after({
  "duration": 2878505217,
  "status": "passed"
});
formatter.before({
  "duration": 5580377292,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Check google coordinate MO",
  "description": "",
  "id": "this-is-a-sample-google-coordinate-bdd-implementation;check-google-coordinate-mo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@DEV"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "URL details for google",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I search anything",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see page coordinate",
  "keyword": "Then "
});
formatter.match({
  "location": "M2class.url_details_for_google()"
});
formatter.result({
  "duration": 8836988792,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_search_anything()"
});
formatter.result({
  "duration": 760536339,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_should_see_page_coordinate()"
});
formatter.result({
  "duration": 369553100,
  "status": "passed"
});
formatter.after({
  "duration": 2424685372,
  "status": "passed"
});
});