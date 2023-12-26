Feature: feature to test ebay product search 

  Scenario: Validate Access a Product via category after applying multiple filters
    Given ebay web-page is opened and navigate to search product with filters
    Then filer option should applied properly in search page


Scenario: Validate Access a Product via Search
    Given ebay Access a Product via Search
    Then filter option should applied properly in search result 

    
