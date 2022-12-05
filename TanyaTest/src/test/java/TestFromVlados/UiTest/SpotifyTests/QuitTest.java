package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuitTest extends SpotifyPage {
    @Test
    public void quitTest() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.profileListButton().click();
        spotifyHomePage.listProfile().get(4).click();
        Assert.assertTrue(spotifyHomePage.loginButton().isDisplayed());
    }
}
