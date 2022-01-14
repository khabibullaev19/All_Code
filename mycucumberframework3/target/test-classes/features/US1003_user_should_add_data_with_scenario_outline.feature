@scenario_outline
Feature: US1003_user_should_add_data_with_scenario_outline

  Scenario Outline: TC01_Testing_the_data_tables_web_page
    Given user is on the data tables page
    And user clicks on the new button
    When user enters the firstname "<firstname>"
    When user enters the lastname "<lastname>"
    When user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    When user clicks on the create button
    And search for the firstname "<firstname>"
    Then verify the name field contains firstname "<firstname>"
    Examples: test data for the data table test
      | firstname | lastname | position | office | extension | startdate | salary |
      | Polat     | Alemdar  | Police   | TR     | 343       | 2020-01-01| 999999 |
      | Memati    | Bas      | RHand    | TUR    | 344       | 2020-01-02| 888888 |
      | Abdulhey  | Coban    | LHand    | IST    | 342       | 2020-01-03| -88888 |
      | Erhan     | Ufuk     | Leg      | ISTA   | 341       | 2020-01-04| 000000 |