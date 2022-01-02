package com.weelo.automationpractice.steps;

import com.weelo.automationpractice.pageobject.AutomationpracticePageObject;
import net.thucydides.core.annotations.Step;

public class AutomationpracticeSteps {

    AutomationpracticePageObject automationpracticePageObject;
    private String product;

    @Step
    public void openBrowser(){
        automationpracticePageObject.open();
    }

    @Step
    public void findProduct(String product) {
        automationpracticePageObject.searchPerform(product);
        this.product = product;
    }

    @Step
    public void pressButtonSearch() {
        automationpracticePageObject.searchingProduct();
    }

    @Step
    public void verifyResults(String productSearch) {
        automationpracticePageObject.validateSearch(productSearch);
    }

    @Step
    public void verifyProductNoExists(String messageExpected) {
        automationpracticePageObject.validateMessageProductNoExists(product, messageExpected);
    }

    @Step
    public void verifyNotCriterionForSearch(String message) {
        automationpracticePageObject.validateMessageNotCriterion(message);
    }

    @Step
    public void verifyQuantityProducts(int quantity) {
        automationpracticePageObject.validateQuantityProduct(quantity);
    }
}
