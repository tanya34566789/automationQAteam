package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.annotations.Test;

public class ChatTest extends SteamPage {
    @Test
    public void chatTest(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.chatButton().click();
        steamHomePage.offlineFriends().click();
        actions().doubleClick(steamHomePage.mySecondAccFriendChat()).perform();
        steamHomePage.messageText().sendKeys("Тест прошел успешно");
        steamHomePage.sendMessage().click();
    }
}
