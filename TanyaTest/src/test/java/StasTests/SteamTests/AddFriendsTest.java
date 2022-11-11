package StasTests.SteamTests;

import StasTests.ForSteamTests.SteamHomePage;
import StasTests.ForSteamTests.SteamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFriendsTest extends SteamPage {
    @Test
    public void addFriends(){
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        goSteam();
        steamHomePage.loginButton().click();
        steamHomePage.loginName().sendKeys(logName());
        steamHomePage.loginPassword().sendKeys(logPass());
        steamHomePage.loginConfButton().click();
        steamHomePage.openMyProfile().click();
        steamHomePage.openAddFriendList().click();
        steamHomePage.addFriendListButton().click();
        steamHomePage.enterFriendNameTextField().sendKeys("Minikup");
        steamHomePage.searchFriend().click();
        steamHomePage.addAsFriendButton().click();
        Assert.assertTrue(steamHomePage.trueAssert().isDisplayed());
    }
}