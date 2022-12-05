package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenProfileTest extends SpotifyPage {
    @Test
    public void openProfile() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.profileListButton().click();
        spotifyHomePage.profileButton().click();
        Assert.assertTrue(spotifyHomePage.profileAssert().isDisplayed());
    }
}
