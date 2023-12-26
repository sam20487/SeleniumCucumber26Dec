Feature: feature to test Jdoddle Home page

  Scenario: Validate Login is successful when login using right credentials
    Given Jdoddle page is open and click on Login
    When username as "shankar.bhanja@gmail.com" and password as "Test@1234" and click on submit
    Then verify login should be successful

  Scenario: Validate Login is unsuccessful when login using wrong credentials
    Given Jdoddle page is open and click on Login
    When username as "shankar.bhanja@gmail.com" and password as "Test@12345" and click on submit
    Then verify login error message

Scenario: Validate the dashboard elements after successful login
    Given Jdoddle page is open and click on Login
    When username as "shankar.bhanja@gmail.com" and password as "Test@1234" and click on submit
    Then verify login should be successful
    Then validate dashboard elements  

Scenario: Validate the platform tab under pricing section is working properly
    Given click on pricing tab
    When click on platform under pricing section
    Then verify Pricing designed for scale

Scenario: Validate the API tab under pricing section is working properly
    Given click on pricing tab
    When click on  API tab under pricing section
    Then verify Pricing plans for all use cases


    


     
    
