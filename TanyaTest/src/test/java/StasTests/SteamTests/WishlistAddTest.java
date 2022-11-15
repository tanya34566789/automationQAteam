package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishlistAddTest extends SteamPage {
    @Test
    public void wishlistTest(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.storeSearch().sendKeys("Cyberpunk");
        steamHomePage.cyberpunk().click();
        steamHomePage.selectAge().click();
        steamHomePage.adult().click();
        steamHomePage.viewPageButton().click();
        steamHomePage.addToWishlistButton().click();
        steamHomePage.myWishlistButton().click();
        Assert.assertTrue(steamHomePage.cyberpunkWishlist().isDisplayed());
    }
}