#Author: your.email@your.domain.com

Feature: Demo Telecom

Background: 
   And click on the add tariff button


 Scenario: add tariff plan validation
  When user need to fillup the fields
  And user click on submit button
  Then verified tariff plans added
  

 # Scenario: add tariff plan validation by 1 dimensional list
  #  When user need to fillup the fields by 1d list
   #   | 9000 | 600 | 80 | 50 | 19 | 1 | 2 |
    #And user click on submit button
    #Then verified tariff plans added

 # Scenario: add tariff plan validation by 1 dimensional map
  #  When user need to fillup the fields by 1d map
   #   | rent | 10000 |
    #  | flm  |   700 |
     # | fim  |    90 |
      #| fsp  |    60 |
    #  | lmc  |    29 |
     # | ipc  |     2 |
      #| spc  |     3 |
  #  And user click on submit button
   # Then verified tariff plans added
