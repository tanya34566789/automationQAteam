package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.SpotifyTests.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.SpotifyTests.ForSpotifyTests.SpotifyPage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends SpotifyPage {
    @Test
    public void searchTest() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(searchTrackOFD());
        Assert.assertTrue(spotifyHomePage.trackAssert().isDisplayed());
    }
}
