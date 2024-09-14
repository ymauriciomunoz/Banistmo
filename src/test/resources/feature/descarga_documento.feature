Feature: yo como usuario de banistmo
  yo quiero buscar el pdf
  luego verifico la descarga del pdf

  Scenario: Descarga del documento satisfactoriamente
    Given el usuario entra ala pagina de banistmo
    When el usuario busca el documento requerido
    Then el usuario puede ver el pdf