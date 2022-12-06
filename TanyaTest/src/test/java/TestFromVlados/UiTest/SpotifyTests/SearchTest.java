package TestFromVlados.UiTest.SpotifyTests;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyHomePage;
import TestFromVlados.UiTest.ForSpotifyTests.SpotifyPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestInit {

    @BeforeMethod
    public void loginSpotify() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        SpotifyPage spotifyPage = new SpotifyPage(driver);
        spotifyPage.goSpofify();
        spotifyHomePage.loginButton().click();
        spotifyHomePage.emailField().sendKeys(spotifyPage.emailSpotify());
        spotifyHomePage.passwordField().sendKeys(spotifyPage.passwordSpotify());
        spotifyHomePage.signButton().click();
        spotifyHomePage.closeNotification().click();
    }

    @Test
    public void searchTest() {
        SpotifyHomePage spotifyHomePage = new SpotifyHomePage(driver);
        SpotifyPage spotifyPage = new SpotifyPage(driver);
        spotifyHomePage.searchButton().click();
        spotifyHomePage.searchField().sendKeys(spotifyPage.searchTrackOFD());
        Assert.assertTrue(spotifyHomePage.trackAssert().isDisplayed());
    }
}
