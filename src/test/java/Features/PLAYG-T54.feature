Feature: 
    @TestCaseKey=PLAYG-T54
    Scenario Outline: Scenario Outline: Multiply two numbers
        
           Give a calculator I just turned on
            Then I multiply <a> and <b> and the result is <c>
        
            Examples:
              |  a | b |  c |
              | 12 | 5 | 10 |
              | 20 | 5 | 100 |