package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SteamSearchTest extends SteamPage {
    @Test
    public void steamSearch(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.storeSearch().sendKeys("Counter-Strike: Global Offensive");
        Assert.assertTrue(steamHomePage.counterStrikeGo().isDisplayed());
    }
}
