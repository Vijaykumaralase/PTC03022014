
@Regression
Feature: Product Search functionality
  
  Scenario Outline: Verify the Product search functionality
    Given I Initiate the browser and Hit the URL
    When I type the short name <Name> and get the Product name which appears as results
    And Click on top deal link
    Then I search usting short name <Name> and should be able to mach both results
    
    Examples: 
    | Name |
    |Tom   |
    |Beet  | 

 