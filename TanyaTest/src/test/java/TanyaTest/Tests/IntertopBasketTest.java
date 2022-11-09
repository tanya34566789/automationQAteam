package TanyaTest.Tests;

import TanyaTest.Pages.IntertopBasketPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntertopBasketTest extends TestInit {
    @Test
    public void addProductsToCart() {
        IntertopBasketPage intertopBasketPage = new IntertopBasketPage(driver);
        intertopBasketPage.navigateIntertop();
        intertopBasketPage.buttonWomen().click();
        intertopBasketPage.buttonSale().click();
        intertopBasketPage.scroll(200);
        intertopBasketPage.openProduct().click();
        intertopBasketPage.scroll(300);
        intertopBasketPage.getSize().click();
        intertopBasketPage.buttonBuy().click();
        driver.navigate().back();
        intertopBasketPage.openProduct2().click();
        intertopBasketPage.scroll(300);
        intertopBasketPage.getSize2().click();
        intertopBasketPage.buttonBuy2().click();
        Assert.assertTrue(intertopBasketPage.basketWindow().isDisplayed());
        intertopBasketPage.pressPlus().click();
        intertopBasketPage.pressDelete().click();
        intertopBasketPage.pressYes().click();
        intertopBasketPage.pressDelete2().click();
        intertopBasketPage.pressYes2().click();
        Assert.assertTrue(intertopBasketPage.emptyBasket().isDisplayed());
    }
}
