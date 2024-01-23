package com.magneto.saucedemo.prueba.compra;

import com.magneto.saucedemo.prueba.utils.AccionesObjetos;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com")
public class CompraPageObject extends PageObject {

    public CompraPageObject(WebDriver driver) {
        super(driver);
    }

    AccionesObjetos accionesObjetos;

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElementFacade strUser;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElementFacade strPassword;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElementFacade btnLogin;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    public WebElementFacade txtItem;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElementFacade btnAddCar;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    public WebElementFacade btnCarrito;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    public WebElementFacade btnCheckout;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    public WebElementFacade strFirstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    public WebElementFacade strLastName;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    public WebElementFacade strZipcode;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebElementFacade btnContinue;

    @FindBy(xpath = "//*[@id=\"finish\"]")
    public WebElementFacade btnFinish;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]")
    public WebElementFacade txtCompleteOrder;


    public void ingresarUser(String user) {
        accionesObjetos.setInputText(strUser, user);

    }

    public void ingresarPassword(String password) {

        accionesObjetos.setInputText(strPassword, password);
    }

    public void darClickBotonLogin() {
        try {
            accionesObjetos.ClickObjeto(btnLogin, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void darClickItem() {
        try {
            accionesObjetos.ClickObjeto(txtItem, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void darClickAddCart() {
        try {
            accionesObjetos.ClickObjeto(btnAddCar, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void darClickCheckout() {
        try {
            accionesObjetos.ClickObjeto(btnCheckout, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void darClickCarrito() {
        try {
            accionesObjetos.ClickObjeto(btnCarrito, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void darClickContinue() {
        try {
            accionesObjetos.ClickObjeto(btnContinue, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void darClickFinish() {
        try {
            accionesObjetos.ClickObjeto(btnFinish, "");
            waitFor(15).seconds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ingresarFirstName(String name) {
        accionesObjetos.setInputText(strFirstName, name);

    }
    public void ingresarLastName(String name) {
        accionesObjetos.setInputText(strLastName, name);

    }
    public void ingresarZipcode(String zip) {
        accionesObjetos.setInputText(strZipcode, zip);

    }
    public String obtenerMensajeOrden() {
        return txtCompleteOrder.getText();
    }

}
