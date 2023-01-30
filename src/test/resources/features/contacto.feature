
Feature: Cliente sign up



  Scenario: el cliente se logea satisfactoriamente
  Given un cliente tiene una cuenta
  When el cliente rellena ls datos de login
  Then el accede a la pagina princial
  
  
  
  Scenario: el cliente no se logea
  Given un cliente tiene una cuenta erronea
  When el cliente rellena ls datos de login erroneos
  Then el accede a la pagina princial DANDO ERROR