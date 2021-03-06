Feature: Formulario de busqueda en la pagina de automationpractice.com

  Description:
  Yo como automatizador de pruebas
  Necesito automatizar el flujo de buscar un producto en la pagina
  Para validar que se realice de manera exitosa

  Background:
    Given Yo Ingreso a la pagina de automationpractice


  @CP001
  Scenario: Verificar que al buscar un producto se muestre de manera exitosa
    When Yo ingreso el nombre del producto a buscar "Blouse"
    And Yo presiono el botón de buscar
    Then Yo verifico que se muestre el producto buscado "Blouse"


  @CP002
  Scenario: Verificar que al buscar un producto no exista
    When Yo ingreso el nombre del producto a buscar "Test"
    And Yo presiono el botón de buscar
    Then Yo verifico que se muestre el mensaje "No results were found for your search"


  @CP003
  Scenario: Verificar que al no colocar ningun criterio se muestre mensaje respectivo
    When Yo presiono el botón de buscar
    Then Yo deberia ver el mensaje "Please enter a search keyword"


  @CP004
  Scenario: Verificar que al buscar un producto con varios resultados puedan ser visualizados
    When Yo ingreso el nombre del producto a buscar "Printed"
    And Yo presiono el botón de buscar
    Then Yo verifico que se muestren 5 productos