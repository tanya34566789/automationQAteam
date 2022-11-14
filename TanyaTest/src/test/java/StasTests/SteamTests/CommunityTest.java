package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommunityTest extends SteamPage {
    @Test
    public void community(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.communitySubMenu().click();
        steamHomePage.communityGame().click();
        steamHomePage.followCommunity().click();
        steamHomePage.unfollowCommunity().click();
        sleep(1);
        steamHomePage.gameNewsButton().click();
        Assert.assertTrue(steamHomePage.gameNewsAssert().isDisplayed());
    }
}
