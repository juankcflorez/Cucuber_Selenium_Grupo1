Feature: Realizar una consulta a través de la opción buscar

  Como usuario quiero realizar una consulta a través del buscador para obterner un mayor detalle de información

  Scenario: Realizar una consulta a través del buscador de la pantalla del Home principal

    Given El usuario se debe encontrar en el Home principal de imalittletester
    When Situarse en la caja de busqueda Serch
    And Ingresar la palabra Selenium
    And Ejecutar la busqueda presionando la tecla Enter
    Then Se debe visualizar los resultados de la busqueda
