package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommunityMarketTest extends SteamPage{
    @Test
    public void communityMarketTest(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        actions().moveToElement(steamHomePage.communitySubMenu()).perform();
        steamHomePage.communityMarket().click();
        steamHomePage.marketDota2().click();
        steamHomePage.marketAdvancedOptions().click();
        steamHomePage.selectHeroField().click();
        steamHomePage.selectHeroSF().click();
        steamHomePage.checkArcana().click();
        steamHomePage.advancedOptionsSearch().click();
        Assert.assertTrue(steamHomePage.sfArcana().isDisplayed());
    }
}