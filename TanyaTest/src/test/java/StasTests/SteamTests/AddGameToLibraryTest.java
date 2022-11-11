package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGameToLibraryTest extends SteamPage {
    @Test
    public void addGameToLibrary(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.storeSearch().sendKeys("Counter-Strike: Global Offensive");
        steamHomePage.counterStrikeGo().click();
        steamHomePage.addGameToLibraryButton().click();
        Assert.assertTrue(steamHomePage.trueAssert().isDisplayed());
    }
}
