Feature: 
    @TestCaseKey=PLAYG-T44
    Scenario: SBA-Wiedervorlage einstellen
        
        Given SBA angemeldeter Benutzer 
        When SBA Benutzer macht eine Wiedervorlage für Auftrag xyz
        Then SBA Benutzer sieht xyz nicht mehr im Postkorb
        And SBA Benutzer findet den Auftrag xyz nun in der Wiedervorlage