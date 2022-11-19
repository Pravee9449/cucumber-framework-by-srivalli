
Feature: 
 
  Scenario: ActiTimr login test
    Given Open browser and enter actitime url
    When user enters <username> and <password> and clicks on login
    
    Then 

  

    Examples: 
      | username  | password | status  |
      | admin		 |     admin | success |
      | trainee | trainee     | fail    |
