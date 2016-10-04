$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("m2feature.feature");
formatter.feature({
  "line": 1,
  "name": "This is a sample google coordinate BDD implementation",
  "description": "",
  "id": "this-is-a-sample-google-coordinate-bdd-implementation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check google coordinate",
  "description": "",
  "id": "this-is-a-sample-google-coordinate-bdd-implementation;check-google-coordinate",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "URL details for google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search anything",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see page coordinate",
  "keyword": "Then "
});
formatter.match({
  "location": "M2class.url_details_for_google()"
});
formatter.result({
  "duration": 45617925207,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_search_anything()"
});
formatter.result({
  "duration": 932364143,
  "status": "passed"
});
formatter.match({
  "location": "M2class.i_should_see_page_coordinate()"
});
formatter.result({
  "duration": 2904995986,
  "status": "passed"
});
});