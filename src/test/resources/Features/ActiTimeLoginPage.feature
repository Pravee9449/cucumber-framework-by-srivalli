
Feature: ActiTime using usingpom
  I want to use this template for my feature file

  Scenario: Validate login page
    Given user open the browser enter the url
    When enter the <username> and <password> and click on login
    Then login page should open with logo
  

    Examples: 
      | name  | value | status  |
      |admin|     manager | success |
      | trainee |trainee | pass    |
