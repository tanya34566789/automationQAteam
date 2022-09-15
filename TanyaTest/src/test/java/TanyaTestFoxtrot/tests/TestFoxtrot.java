package TanyaTestFoxtrot.tests;

import TanyaTestFoxtrot.pageObjects.FoxtrotHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFoxtrot extends TestInit{
    @Test
    public void cheackHeader() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        foxtrotHomePage.navigateFoxtrot();
        Assert.assertTrue(foxtrotHomePage.getLogoImage().isDisplayed());
        Assert.assertTrue(foxtrotHomePage.getItems().isDisplayed());
        Assert.assertTrue(foxtrotHomePage.getSearchField().isDisplayed());
    }

    @Test
    public void cheackSearch() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        foxtrotHomePage.navigateFoxtrot();
        foxtrotHomePage.getSearchField().sendKeys("Smartphones\n");
        sleep(2);
        Assert.assertTrue(foxtrotHomePage.getSearchField().isDisplayed());
        foxtrotHomePage.getPrice().sendKeys("000");
        sleep(2);
        Assert.assertTrue(foxtrotHomePage.getPrice().isDisplayed());
        foxtrotHomePage.getPriceOk().click();
        sleep(1);
        foxtrotHomePage.getSamsungA().click();
        // Assert.assertTrue(foxtrotHomePage.getSamsungA().isDisplayed());
        sleep(2);
        foxtrotHomePage.getBuyBtn().click();
        //Assert.assertTrue(foxtrotHomePage.getBuyBtn().isDisplayed());
        sleep(2);
        foxtrotHomePage.getBasketIcon().click();
        sleep(2);
        Assert.assertTrue(foxtrotHomePage.getBasketIcon().isDisplayed());
    }
}



