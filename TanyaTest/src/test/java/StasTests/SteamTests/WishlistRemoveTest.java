package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishlistRemoveTest extends SteamPage {
    @Test
    public void wishlistRemoveTest(){
        SteamHomePage steamSecondPages = new SteamHomePage(driver);
        goSteam();
        steamSecondPages.loginButton().click();
        steamSecondPages.loginName().sendKeys(logName());
        steamSecondPages.loginPassword().sendKeys(logPass());
        steamSecondPages.loginConfButton().click();
        steamSecondPages.myWishlistButton().click();
        steamSecondPages.deleteWishlist().click();
        steamSecondPages.deleteOK().click();
        Assert.assertTrue(steamSecondPages.removeWishlistAssert().isDisplayed());
    }
}