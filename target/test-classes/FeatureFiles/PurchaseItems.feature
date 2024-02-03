
@Smoke
Feature: Product purchase functionality
  
  
   Background: 
   Given I Initiate the browser and Hit the URL
   
  Scenario Outline: Verify the Product search functionality
    When I type the short name <Name> and get the Product name which appears as results
    And i increase the Quantity
    Then User proceed to checkout and validate <Name> items in checkout page
    Then check the availibility of promocode and checkout option
    Examples: 
    | Name |
    |Tom   |
    
    Scenario: Verify the logo
   
    When I check for the logo
   Then i should be able match the logo
    
    
    

 