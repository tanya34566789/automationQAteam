package TanyaTestFoxtrot.tests;

import TanyaTestFoxtrot.pageObjects.FoxtrotHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFoxtrot extends TestInit {
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
        Assert.assertTrue(foxtrotHomePage.getSearchField().isDisplayed());
        foxtrotHomePage.getPrice().sendKeys("000");
        Assert.assertTrue(foxtrotHomePage.getPrice().isDisplayed());
        foxtrotHomePage.getPriceOk().click();
        foxtrotHomePage.getSamsungA().click();
        Assert.assertTrue(foxtrotHomePage.getSamsungA().isDisplayed());
        foxtrotHomePage.getBuyBtn().click();
        Assert.assertTrue(foxtrotHomePage.getBuyBtn().isDisplayed());
        foxtrotHomePage.getBasketIcon().click();
        Assert.assertTrue(foxtrotHomePage.getBasketIcon().isDisplayed());
    }

    @Test
    public void checkFilter() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        foxtrotHomePage.navigateFoxtrot();
        foxtrotHomePage.getSearchField().sendKeys("Smartphones\n");
        Assert.assertTrue(foxtrotHomePage.getSearchField().isDisplayed());
        foxtrotHomePage.getIcon().click();
        for (int i = 0; i < 6; i++) {
            foxtrotHomePage.getBrand().get(i).click();
        }

    }
}


