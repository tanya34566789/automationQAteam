package TestFromVlados.UiTest.ForSpotifyTests;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpotifyHomePage extends BasePage {

    public SpotifyHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement libraryButton(){
        return findElementByXpath("//div[contains(@class,\"b2K\")]");
    }

    public WebElement libraryAssert(){
        return findElementByXpath("//div[contains(@class,\"_gB1\")]");
    }

    public WebElement settingsButton(){
        return findElementByXpath("//a[contains(@class,\"Nm\")]");
    }

    public WebElement languageList(){
        return findElementByXpath("//select[contains(@id,\"Language\")]");
    }

    public WebElement moveToTrack(){
        return findElementByXpath("//div[contains(@class,'h4')]");
    }

    public WebElement loginButton(){
        return findElementByXpath("//button[contains(@data-testid,'login')]");
    }

    public WebElement emailField(){
        return findElementByXpath("//input[@id='login-username']");
    }

    public WebElement passwordField(){
        return findElementByXpath("//input[@id=\"login-password\"]");
    }

    public WebElement signButton(){
        return findElementByXpath("//button[@id=\"login-button\"]");
    }

    public WebElement profileListButton(){
        return findElementByXpath("//button[contains(@class, 'odcjv')]");
    }

    public WebElement profileButton(){
        return findElementByXpath("//a[contains(@href,'/user/')]");
    }

    public WebElement profileAssert() {
        return findElementByXpath("//h2[contains(@class,'g')]");
    }

    public WebElement searchButton(){
        return findElementByXpath("//li[contains(@class,\"e\")]/a[@href=\"/search\"]");
    }

    public WebElement searchField(){
        return findElementByXpath("//input[@data-testid='search-input']");
    }

    public WebElement openTrack(){
        return findElementByXpath("//div[contains(@class,'_g')]");
    }

    public WebElement playTrack(){
        return findElementByXpath("//span[contains(@class,'ButtonInner-sc-14ud5tc-0 d')]");
    }

    public WebElement assertPause(){
        return findElementByXpath("//button[contains(@class,'vn')]");
    }

    public WebElement likedTrack(){
        return findElementByXpath("//button[@aria-disabled=\"false\"][@class=\"wC9sIed7pfp47wZbmU6m\"]/child::span");
    }

    public WebElement unLikedTrack(){
        return findElementByXpath("//button[contains(@class,'tG')]");
    }

    public WebElement goLikedPlaylist(){
        return findElementByXpath("//a[contains(@class,'r9')]");
    }

    public WebElement checkTrackInPlaylist(){
        return findElementByXpath("//div[@class=\"gvLrgQXBFVW6m9MscfFA\"][@role=\"gridcell\"]/child::div");
    }

    public WebElement closeNotification(){
        return findElementByXpath("//button[contains(@class,\"ui\")]");
    }

    public List<WebElement> checkTrackInPlaylistNull(){
        return driver.findElements(By.xpath("//div[@class=\"gvLrgQXBFVW6m9MscfFA\"][@role=\"gridcell\"]/child::div"));
    }

    public List<WebElement> listProfile(){
        return driver.findElements(By.xpath("//li[contains(@class,\"Du\")]"));
    }

    public WebElement trackAssert(){
        return findElementByXpath("//div[text()='O.F.D.']");
    }

    public WebElement playOnPanel(){
        return findElementByXpath("//button[contains(@class,'vn')]");
    }

    public WebElement nextTrackButton(){
        return findElementByXpath("//button[contains(@class,\"mni\")]");
    }

    public WebElement nextTrackAssert(){
        return findElementByXpath("//div[contains(@aria-label,\"MORE\")]");
    }

    public WebElement backTrackButton() {
        return findElementByXpath("//button[contains(@class,'fn72')]");
    }

    public WebElement backTrackAssert(){
        return findElementByXpath("//div[contains(@aria-label,'POP')]");
    }

    public WebElement buttonWordsForTrack(){
        return findElementByXpath("//button[contains(@class,\"ZM\")]");
    }

    public WebElement wordForTrackAssert(){
        return findElementByXpath("//div[contains(@class,\"esRBy\")]");
    }

    public WebElement checkNextTrackList(){
        return findElementByXpath("//div[contains(@class,\"Gl\")]/button[contains(@class,'d')]");
    }

    public WebElement nextListAssert(){
        return findElementByXpath("//main[contains(@aria-label,'Spotify')]");
    }

    public WebElement chooseDeviceButton(){
        return findElementByXpath("//button[contains(@class,\"Nitz\")]");
    }

    public WebElement deviceChooseAssert(){
        return findElementByXpath("//div[contains(@class,'tm3')]");
    }

    public WebElement volumeButton(){
        return findElementByXpath("//button[contains(@class,'vo')]");
    }

    public WebElement volumeOffAssert(){
        return findElementByXpath("//*[@aria-label=\"Volume off\"]");
    }

    public WebElement volumeOnAssert(){
        return findElementByXpath("//*[@aria-label=\"Volume high\"]");
    }

    public WebElement buttonTracks() {
        return findElementByXpath("//a[contains(@href,'O.F.D./tracks')]");
    }

    public WebElement assertButtonTracks(){
        return findElementByXpath("//div[contains(@class,'dZPm')]");
    }

    public WebElement buttonAlbums(){
        return findElementByXpath("//a[contains(@href,'O.F.D./albums')]");
    }

    public WebElement assertButtonAlbums(){
        return findElementByXpath("//div[contains(@class,'E1N1B')]");
    }

    public WebElement buttonArtist() {
        return findElementByXpath("//a[contains(@href,'O.F.D./artist')]");
    }

    public WebElement assertButtonArtist(){
        return findElementByXpath("//div[contains(@class,'tsv7E_RBBw6v0XTQlcRo')]");
    }

    public WebElement buttonEpisodes() {
        return findElementByXpath("//a[contains(@href,'O.F.D./podcastAndEpisodes')]");
    }

    public WebElement assertButtonEpisodes(){
        return findElementByXpath("//a[contains(@class,'MfVrtIzQJ7iZXfRWg6eM')]");
    }

    public WebElement buttonGenres() {
        return findElementByXpath("//a[contains(@href,\"genres\")]");
    }

    public WebElement assertButtonGenres(){
        return findElementByXpath("//div[contains(@class,'tsv7E')]");
    }

    public WebElement assertAccountPage() {
        return findElementByXpath("//div[contains(@class,'sc-96566f4c-5 FdywA')]");
    }

    public WebElement assertPremiumPage() {
        return findElementByXpath("//div[contains(@class,\"mh-container\")]");
    }

}
