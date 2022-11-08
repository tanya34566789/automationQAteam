package TanyaTest.Tests;

import FrameworkClasses.TestInit;
import TanyaTest.Pages.UkrNetResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UkrNetResultTest extends TestInit {
    @Test
    public void checkHeadlines() {
        UkrNetResultPage ukrNetResultPage = new UkrNetResultPage(driver);
        ukrNetResultPage.navigateUkrNet();
        ukrNetResultPage.buttonMain().click();
        driver.navigate().back();
        ukrNetResultPage.buttonPolitika().click();
        driver.navigate().back();
        ukrNetResultPage.buttonEkonomika().click();
        driver.navigate().back();
        ukrNetResultPage.buttonEvents().click();
        driver.navigate().back();
        Assert.assertTrue(ukrNetResultPage.buttonMain().isDisplayed());
        Assert.assertTrue(ukrNetResultPage.buttonPolitika().isDisplayed());
        Assert.assertTrue(ukrNetResultPage.buttonEvents().isDisplayed());
        Assert.assertTrue(ukrNetResultPage.buttonEkonomika().isDisplayed());
    }
}
