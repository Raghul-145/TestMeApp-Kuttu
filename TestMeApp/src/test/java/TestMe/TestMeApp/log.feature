
@tag
Feature: Login
  I want to use this template for my feature file

 

  @tag2
  Scenario Outline: Signing in
    Given User is in login page
    Given Enter the "<username>"
    When Enters the "<password>"
    Then Click the signin button

    Examples: 
      | username  | password    | 
      | lalitha   | password123 | 
     
