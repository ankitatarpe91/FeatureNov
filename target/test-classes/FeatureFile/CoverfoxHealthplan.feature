Feature: CoverFox Health Insurance Test
Scenario: TC01:Validate Coverfox Health Insurance Plan For Single Person

Given I am on Home Page
When I click on getStarted button
And I click on next button
And  I provide age as "32" and click on Next button
And i provide pincode as "412101" , mobNumber as "7656458767" and click on Continue button
Then matching health Insurance plan should be displyed as "48"


Scenario: TC02:Validate Coverfox Health Insurance Plan For Single Person
When I click on getStarted button
And I click on next button
And  I provide age as "32" and click on Next button
And I click on Continue button
Then Validate error message