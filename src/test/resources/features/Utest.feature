# Autor: Fabian Chaparro
  @stories
  Feature: Utest
    I want to create a user to access the Utest page
    @scenario1
    Scenario: Utest Register
      Given than fabian wants login in page Utest
      | strName         | strLastName       |  strEmail               |
      | Fabian Eduardo  | Chaparro Rojas    | bulla_1993@hotmail.com  |
      When he perform password confirmation
      | strPassword    | strPassword1  |
      | Fabian_01.     | Fabian_01.    |
      Then he performs configuration completed of user creation
      | strRegister               |
      | Configuración completa  |