package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterEpisodesTest extends SpotifyPage {
    @Test
    public void buttonEpisodes() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackOFD());
        spotifyHomePage.buttonEpisodes().click();
        Assert.assertTrue(spotifyHomePage.assertButtonEpisodes().isDisplayed());
    }
}
