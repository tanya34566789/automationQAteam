package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpamProtectionTest extends SteamPage {
    @Test
    public void spamSecurity() {
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.chatButton().click();
        steamHomePage.offlineFriends().click();
        actions().doubleClick(steamHomePage.mySecondAccFriendChat()).perform();
        for (int i = 0; i <= 10; i ++){
            steamHomePage.messageText().sendKeys("Проверка защиты от спама");
            steamHomePage.sendMessage().click();
        }
        Assert.assertTrue(steamHomePage.chatErrorAssert().isDisplayed());
    }
}