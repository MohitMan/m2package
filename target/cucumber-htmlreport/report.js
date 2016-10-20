$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("m2feature.feature");
formatter.feature({
  "line": 1,
  "name": "This is a sample google coordinate BDD implementation",
  "description": "",
  "id": "this-is-a-sample-google-coordinate-bdd-implementation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21029029461,
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
  "duration": 12058659699,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_search_anything()"
});
formatter.result({
  "duration": 574132097,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_should_see_page_coordinate()"
});
formatter.result({
  "duration": 182080090,
  "status": "passed"
});
formatter.after({
  "duration": 3498315046,
  "status": "passed"
});
formatter.before({
  "duration": 5092597348,
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
  "duration": 9261248408,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_search_anything()"
});
formatter.result({
  "duration": 361639883,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_should_see_page_coordinate()"
});
formatter.result({
  "duration": 170399744,
  "status": "passed"
});
formatter.after({
  "duration": 2728405208,
  "status": "passed"
});
});