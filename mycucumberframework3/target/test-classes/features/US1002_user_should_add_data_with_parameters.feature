@datasearchwithparams
Feature: US1002_user_should_add_data_with_parameters

  Scenario: TC01_Testing_the_data_tables_web_page
    Given user is on the data tables page
    And user clicks on the new button
    When user enters the firstname "Ali"
    When user enters the lastname "Candan"
    When user enters the position "SDET"
    When user enters the office "Home"
    When user enters the extension "34PLT34"
    When user enters the startdate "2003-01-01"
    When user enters the salary "100000"
    When user clicks on the create button
    And search for the firstname "Ali"
    Then verify the name field contains firstname "Ali"

  Scenario: TC02_Testing_the_data_tables_web_page
    Given user is on the data tables page
    And user clicks on the new button
    When user enters the firstname "fakename"
    When user enters the lastname "fakelast"
    When user enters the position "fakeposition"
    When user enters the office "fakeoffice"
    When user enters the extension "fakeextension"
    When user enters the startdate "2021-01-01"
    When user enters the salary "100000"
    When user clicks on the create button
    And search for the firstname "fakename"
    Then verify the name field contains firstname "fakename"

  Scenario: TC03_Testing_the_data_tables_web_page
    Given user is on the data tables page
    And user clicks on the new button
    When user enters the firstname "Ali1"
    When user enters the lastname "Candan1"
    When user enters the position "SDET1"
    When user enters the office "Home1"
    When user enters the extension "34PLT341"
    When user enters the startdate "2003-01-02"
    When user enters the salary "100001"
    When user clicks on the create button
    And search for the firstname "Ali1"
    Then verify the name field contains firstname "Ali1"