#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@tag
Feature: Messaging functionality 

  @tag1
  Scenario: Sending a message 
    Given that I go to the url http://automationpractice.com/index.php
    When I click on "Contact us"
    And select a sub heading "Customer Service"
    And type in the email adress "test@testingemail.com" 
    And type in a message "abc test message"
    And click on "Send"
    Then the message should be sent with the following message showing  "Your message has been successfully sent to our team."

