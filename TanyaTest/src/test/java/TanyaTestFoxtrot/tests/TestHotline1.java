package TanyaTestFoxtrot.tests;

import TanyaTestFoxtrot.pageObjects.HotlineHomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestHotline1 extends TestInit {
    @Test
    public void cheackHomeSpan() {
        HotlineHomePage hotlineHomePage = new HotlineHomePage(driver);
        hotlineHomePage.navigateHotline();
        ArrayList<String> listOfNames = new ArrayList<>();
        for (int i = 1; i < hotlineHomePage.categoryNames().size(); i++) {
            listOfNames.add(hotlineHomePage.categoryNames().get(i).getText());
        }

        for (int j = 1; j < 8; j++) {
            hotlineHomePage.categoryNames().get(j).click();
            Assert.assertEquals(listOfNames.get(j), hotlineHomePage.nameInside().getText());
            driver.navigate().back();
        }

    }
    @Test
        public void checkCatalogGoods() {
        HotlineHomePage hotlineHomePage = new HotlineHomePage(driver);
        hotlineHomePage.navigateHotline();
        hotlineHomePage.catalog().click();
        Actions action = new Actions(driver);
        action.moveToElement(hotlineHomePage.military()).perform();
        hotlineHomePage.militaryClothes().click();
        driver.navigate().back();
        hotlineHomePage.petProducts().click();
        driver.navigate().back();
    }
}



