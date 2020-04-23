@FunctionalTest
Feature: Verify that tagging functionality

@SmokeTest @RegressionTest
Scenario: Verify home page functionality
Given User enter home page

@RegressionTest
Scenario: Verify that contact us functionality
Given User on the contact us page

@SmokeTest 
Scenario: Verify that about us page functionality
Given User on the about us page

@End2EndTest
Scenario: Verify that home page title functionality
Given User verify the home page title

@SmokeTest @RegressionTest
Scenario: Verify that career page  functionality
Given User on the career page

@SmokeTest @End2EndTest
Scenario: Verify that our services page functionality
Given User on the our services page