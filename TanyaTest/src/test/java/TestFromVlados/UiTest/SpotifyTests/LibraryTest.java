package TestFromVlados.UiTest.SpotifyTests;

import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryTest extends SpotifyPage {
    @Test
    public void libraryCheck(){
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        spotifyHomePage.libraryButton().click();
        Assert.assertTrue(spotifyHomePage.libraryAssert().isDisplayed());
    }
}
