package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTracksTest extends SpotifyPage {
    @Test
    public void searchButton() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackOFD());
        spotifyHomePage.buttonTracks().click();
        Assert.assertTrue(spotifyHomePage.assertButtonTracks().isDisplayed());
    }
}
