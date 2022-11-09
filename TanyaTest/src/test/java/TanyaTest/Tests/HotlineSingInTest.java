package TanyaTest.Tests;

import TanyaTest.Pages.HotlineSingInPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineSingInTest extends TestInit {
    @Test
    public void checkLogin() {
        HotlineSingInPage hotlineSingInPage = new HotlineSingInPage(driver);
        hotlineSingInPage.navigateHotline();
        hotlineSingInPage.user().click();
        hotlineSingInPage.email().sendKeys("tanyamaystrenko@gmail.com");
        hotlineSingInPage.password().sendKeys("12345");
        hotlineSingInPage.singinBtn().click();
        Assert.assertTrue(hotlineSingInPage.password().isDisplayed());
        Assert.assertTrue(hotlineSingInPage.email().isDisplayed());
    }
}
