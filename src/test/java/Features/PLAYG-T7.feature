Feature: 
    @TestCaseKey=PLAYG-T7
    Scenario: Anmelden als Sachbearbeiter
        
          Given Logon Page of the SBA
            And Benutzer gibt in das Feld Benutzername HeroDesTages ein.
            And Benutzer gibt in das Feld Passowrd bye8#8Twitter! ein.
            When Benutzer klickt die Schaltfläche Anmelden.
            Then wird der SBA Home Bildschirm angezeigt.