$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/hooks.feature");
formatter.feature({
  "name": "This is a hooks feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is a hooks scenario 1 file",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on hooks concept1",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HooksClass.i_am_on_hooks_concept1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This is a hooks scenario 2 file",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on hooks concept2",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HooksClass.i_am_on_hooks_concept2()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This is a hooks scenario 3 file",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on hooks concept3",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HooksClass.i_am_on_hooks_concept3()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This is a hooks scenario 4 file",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on hooks concept4",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HooksClass.i_am_on_hooks_concept4()"
});
formatter.result({
  "status": "passed"
});
});