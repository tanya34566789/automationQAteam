package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSettingsTest extends SpotifyPage {
    @Test
    public void openSettings() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.profileListButton().click();
        spotifyHomePage.settingsButton().click();
        Assert.assertTrue(spotifyHomePage.languageList().isDisplayed());
    }
}
