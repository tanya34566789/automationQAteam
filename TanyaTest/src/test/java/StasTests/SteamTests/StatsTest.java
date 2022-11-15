package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StatsTest extends SteamPage {
    @Test
    public void stats(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        sleep(2);
        actions().moveToElement(steamHomePage.storeSubMenu()).perform();
        steamHomePage.statsApps().click();
        steamHomePage.topSellers().click();
        Assert.assertTrue(steamHomePage.topSellersAssert().isDisplayed());
        steamHomePage.mostPlayed().click();
        Assert.assertTrue(steamHomePage.mostPlayedAssert().isDisplayed());
    }
}