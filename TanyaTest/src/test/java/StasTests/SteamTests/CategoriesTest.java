package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends SteamPage {
    @Test
    public void categoriesCheckTest() {
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        actions().moveToElement(steamHomePage.categoryCatalog()).perform();
        steamHomePage.categoryJRPG().click();
        Assert.assertTrue(steamHomePage.assertCategory().isDisplayed());
        actions().moveToElement(steamHomePage.categoryCatalog()).perform();
        steamHomePage.categoryAnime().click();
        Assert.assertTrue(steamHomePage.assertCategory().isDisplayed());
        actions().moveToElement(steamHomePage.categoryCatalog()).perform();
        steamHomePage.categorySingleplayer().click();
        Assert.assertTrue(steamHomePage.assertCategory().isDisplayed());
        actions().moveToElement(steamHomePage.categoryCatalog()).perform();
        steamHomePage.categorySoundtracks().click();
        Assert.assertTrue(steamHomePage.assertCategory().isDisplayed());
    }
}