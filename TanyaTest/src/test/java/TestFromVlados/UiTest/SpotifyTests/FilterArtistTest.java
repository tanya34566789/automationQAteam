package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterArtistTest extends SpotifyPage {
    @Test
    public void artistButton() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackOFD());
        spotifyHomePage.buttonArtist().click();
        Assert.assertTrue(spotifyHomePage.assertButtonArtist().isDisplayed());
    }
}
