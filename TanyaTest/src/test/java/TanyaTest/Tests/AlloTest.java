package TanyaTest.Tests;


import TanyaTest.Pages.AlloPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlloTest extends TestInit {
    @Test
    public void checkShops() {
        AlloPage alloPage = new AlloPage(driver);
        alloPage.navigateAllo();
        alloPage.buttonShops().click();
        alloPage.buttonKyiv().click();
        alloPage.buttonFilter().click();
        alloPage.scroll(400);
        Assert.assertTrue(alloPage.buttonFilter().isDisplayed());
        driver.navigate().back();
    }

    @Test
    public void checkShares() {
        AlloPage alloPage = new AlloPage(driver);
        alloPage.navigateAllo();
        alloPage.buttonShares().click();
        alloPage.buttonPresents().click();
        sleep(2);
        alloPage.buttonAirСonditioners().click();
        sleep(2);
        alloPage.scroll(300);
        for (int i = 0; i < 4; i++) {
            alloPage.buttonCompare().get(i).click();
        }
        sleep(2);
        alloPage.Compare().click();
        Assert.assertTrue(alloPage.Compare().isDisplayed());
    }
}
