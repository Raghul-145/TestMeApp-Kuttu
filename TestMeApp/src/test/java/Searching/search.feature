
@tag
Feature: Searching

  @tag1
  Scenario: Product search
    Given Must be in home page "lalitha" and "password123"
    And Search the product "Head"
    When Clicks the find detail button
  	Then Cart page appeared
  