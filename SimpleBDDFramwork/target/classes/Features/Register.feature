Feature: Nopcommerce Register

  Background:
    Given User able to open browser
    And Enter Url

  Scenario: Nopcommerce Valid Register Test
    Then User click on register Link
    Then User Select the gender
    Then user Enter the Firstname, Lastname and email id
    Then User enter the company Name, password and confirm password
    Then User select the DOB
    And User click on register Button