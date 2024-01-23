package com.magneto.saucedemo.prueba.compra;

import cucumber.api.DataTable;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class CompraSteps {

    CompraPageObject compraPageObject;

    @Step
    public void AbrirNavegador() {
        compraPageObject.open();
    }

    @Step("Ingresar datos de acceso ")
    public void iniciarSesionExitosa(DataTable datos) {
        List<List<String>> data = datos.raw();
        compraPageObject.ingresarUser(data.get(0).get(0).trim());
        compraPageObject.ingresarPassword(data.get(0).get(1).trim());
        compraPageObject.darClickBotonLogin();
    }


    @Step("Selecionar el producto")
    public void seleccionarProducto() {
        compraPageObject.darClickItem();
        compraPageObject.darClickAddCart();

    }

    @Step("Ir al carrito de compra para pagar")
    public void seleccionarCarrito() {
        compraPageObject.darClickCarrito();

    }

    @Step("confirmar compra")
    public void confirmarCompra() {
        compraPageObject.darClickCheckout();
        compraPageObject.ingresarFirstName("alguien");
        compraPageObject.ingresarLastName("perez");
        compraPageObject.ingresarZipcode("5023");
        compraPageObject.darClickContinue();

    }

    @Step("Terminar compra")
    public void terminarCompra() {
        compraPageObject.darClickFinish();

    }

    @Step("verificar el mensaje del pedido")
    public void verificarMensajedelPedido(String mensaje) {
        assertThat(compraPageObject.obtenerMensajeOrden(),containsString(mensaje));
        Serenity.takeScreenshot();
    }


}
