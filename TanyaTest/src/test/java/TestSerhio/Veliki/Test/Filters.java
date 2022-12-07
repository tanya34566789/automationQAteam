package TestSerhio.Veliki.Test;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestSerhio.Veliki.Page.FiltersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Filters extends TestInit {
    @Test
    public void Filters() {
        FiltersPage FiltersTest = new FiltersPage(driver);
        driver.manage().window().maximize();
        FiltersTest.goToVeliki();
        FiltersTest.velikiUa().click();
        FiltersTest.filterSport().click();
        FiltersTest.filterTrainers().click();
        FiltersTest.filterCardioTrainer().click();
        FiltersTest.fieldMinPrice().click();
        FiltersTest.fieldMinPrice().clear();
        FiltersTest.fieldMaxPrice().clear();
        FiltersTest.fieldMinPrice().sendKeys("1500");
        FiltersTest.fieldMaxPrice().sendKeys("5000");
        FiltersTest.fieldButtonOkMinMaxPrice().click();
        FiltersTest.filterHouseFit().click();
        Assert.assertTrue(FiltersTest.cardioHouseFit().isDisplayed());
    }
}
