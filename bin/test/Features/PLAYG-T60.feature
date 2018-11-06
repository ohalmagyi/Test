Feature: 
    @TestCaseKey=PLAYG-T60
    Scenario Outline: Login
        
        Given Initialize the browser and navigate to <url>
        When User enters Username an Password and logs in
        Then Verify that user is successfully logged in
        
        Examples: 
        | url |
        | http://automationpractice.com/index.php/ |
        | http://www.yahoo.com |
        | http://www.google.com |
        | http://www.ibm.com |