package com.magneto.saucedemo.prueba.compra;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraDefinitions {

    @Steps
    CompraSteps compraSteps;

    @Given("^ingreso al la pagina  y entro con el usuario$")
    public void ingresoPaginaEntroConUsuario(DataTable datos) {
        compraSteps.AbrirNavegador();
        compraSteps.iniciarSesionExitosa(datos);
    }

    @When("^Seleciono el Item a comprar$")
    public void selecionoItemComprar() {
        compraSteps.seleccionarProducto();

    }

    @When("^Ingreso al carrito a pagar  y lleno los datos de compra$")
    public void ingresoAlCarritoAPagar() {
        compraSteps.seleccionarCarrito();
        compraSteps.confirmarCompra();
        compraSteps.terminarCompra();

    }

    @Then("^verifico si se logro la compra \"([^\"]*)\"$")
    public void verificoSeLogroCompra(String mensaje) {

        compraSteps.verificarMensajedelPedido(mensaje);
    }


}
