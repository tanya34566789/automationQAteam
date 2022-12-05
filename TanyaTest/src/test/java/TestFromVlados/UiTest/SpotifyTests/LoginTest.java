package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SpotifyPage {
    @Test
    public void loginAssertTest() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        Assert.assertTrue(spotifyHomePage.profileListButton().isDisplayed());
    }

}
