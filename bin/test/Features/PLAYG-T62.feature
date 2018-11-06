Feature: 
    @TestCaseKey=PLAYG-T62
    Scenario: Login yahoo
        
        Given Initialize Firefox and Navigate to yahoo site
        When User enters Username and Password and logs in
        Then Verify that the user is successfully logged in