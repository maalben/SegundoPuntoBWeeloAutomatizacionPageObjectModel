package com.weelo.automationpractice.definitions;

import com.weelo.automationpractice.steps.AutomationpracticeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AutomationpracticeDefinitions {

    @Steps
    AutomationpracticeSteps start;

    @Given("^Yo Ingreso a la pagina de automationpractice$")
    public void yoIngresoALaPaginaDeAutomationpractice() {
        start.openBrowser();
    }

    @When("^Yo ingreso el nombre del producto a buscar \"([^\"]*)\"$")
    public void yoIngresoElNombreDelProductoABuscar(String product) {
        start.findProduct(product);
    }

    @When("^Yo presiono el botón de buscar$")
    public void yoPresionoElBotónDeBuscar() {
        start.pressButtonSearch();
    }

    @Then("^Yo verifico que se muestre el producto buscado \"([^\"]*)\"$")
    public void yoVerificoQueSeMuestreElProductoBuscado(String productSearch) {
        start.verifyResults(productSearch);
    }

    @Then("^Yo verifico que se muestre el mensaje \"([^\"]*)\"$")
    public void yoVerificoQueSeMuestreElMensaje(String messageNotFoundProduct) {
        start.verifyProductNoExists(messageNotFoundProduct);
    }

    @Then("^Yo deberia ver el mensaje \"([^\"]*)\"$")
    public void yoDeberiaVerElMensaje(String message) {
        start.verifyNotCriterionForSearch(message);
    }

    @Then("^Yo verifico que se muestren (\\d+) productos$")
    public void yoVerificoQueSeMuestrenProductos(int quantity) {
        start.verifyQuantityProducts(quantity);
    }
}