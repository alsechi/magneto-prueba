@Compra
Feature: Escenarios de compra en la pagina  https://www.saucedemo.com/

  @CompraExitosa
  Scenario Outline: Compra Exitosa
    Given ingreso al la pagina  y entro con el usuario
          |<User>| <Password>|
    When Seleciono el Item a comprar
    When Ingreso al carrito a pagar  y lleno los datos de compra
    Then verifico si se logro la compra <Mensaje>

    Examples:
      |User|Password|Mensaje|
      |standard_user|secret_sauce|"Thank you for your order!"|

