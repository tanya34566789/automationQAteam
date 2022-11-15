package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscussionTest extends SteamPage {
    @Test
    public void discussionTest() {
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        actions().moveToElement(steamHomePage.communitySubMenu()).perform();
        steamHomePage.discussion().click();
        Assert.assertTrue(steamHomePage.discussionHeader().isDisplayed());
        steamHomePage.gameForums().click();
        steamHomePage.toolsAndServise().click();
    }
}