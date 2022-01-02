package com.weelo.automationpractice.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.junit.Assert.assertEquals;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationpracticePageObject extends PageObject {

    @FindBy(id = "search_query_top")
    public WebElementFacade txtSearch;

    @FindBy(name = "submit_search")
    public WebElementFacade btnSearch;

    @FindBy(xpath = "//ul[@class='product_list grid row']//h5")
    public WebElementFacade productResult;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElementFacade alertWarning;

    @FindBy(xpath = "//ul[@class='product_list grid row']/li")
    public List<WebElement> listProductSearch;

    public void searchPerform(String product) {
        txtSearch.sendKeys(product);
    }

    public void searchingProduct() {
        btnSearch.click();
    }

    public void validateSearch(String productSearch) {
        assertEquals(productSearch, productResult.getText());
    }

    public void validateMessageProductNoExists(String product, String messageExpected) {
        assertEquals(messageExpected + " \"" + product + "\"", alertWarning.getText());
    }

    public void validateMessageNotCriterion(String message) {
        assertEquals(message, alertWarning.getText());
    }

    public void validateQuantityProduct(int quantity) {
        assertEquals(quantity, listProductSearch.size());
    }
}
