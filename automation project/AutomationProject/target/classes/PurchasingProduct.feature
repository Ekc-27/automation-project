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
Feature: Product purchase

  @tag1
  Scenario: End to end test select a product and purchasing it
    Given that I type in the url http://automationpractice.com/index.php
    And I am signed out    
    When I click Sign in
    And I type in email section test@testingemail.com
    And I type in password section abcd123
    And I click Sign in
    And I click the website logo to go to the homepage 
    And I click on a product button "Add to cart"
    And I click Cart 
    And I click on "Proceed to checkout"
    And I click on "Proceed to checkout"
    And I click on "Terms of service" tickbox with message "I agree to the terms of service and will adhere to them unconditionally."
    And I click on "Proceed to checkout"
    And I click "Pay by bank wire"
    And I click on "I confirm my order"
    Then The order confirmation page should be shown.
