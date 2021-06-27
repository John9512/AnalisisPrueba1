#autor: john mario cabrera
@stories
Feature: Ingresar a la pagina Utest.com, diligenciar el formulario y crear un nuevo usuario
  Como un usuario, quiero entrar a la pagina Utest.com y automatizar el ingreso de datos y registro
  @Scenario1
  Scenario: Buscar la pagina para la automatizacion
    Given John quiere crear su usuario en la pagina
    When Se llena el formulario de datos pedidos
    Then Se crea el nuevo usuario satisfactoriamente