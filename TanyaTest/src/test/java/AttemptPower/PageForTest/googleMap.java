package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class googleMap extends BasePage {
    public googleMap(WebDriver driver) {
        super(driver);
    }
    public WebElement howToGetButton() {
        return driver.findElement(By.xpath("//img[@src=\"//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png\"]"));
    }
    public WebElement wherefrom() {
        return driver.findElement(By.xpath("//input[@class=\"tactile-searchbox-input\"][@aria-controls=\"sbsg51\"]"));
    }
    public WebElement goTo() {
        return driver.findElement(By.xpath("//input[@class=\"tactile-searchbox-input\"][@aria-controls=\"sbsg52\"]"));
    }
    public WebElement byPublicTransport() {
        return driver.findElement(By.xpath("//img[@jsan=\"7.OzmNAc,8.src,0.alt,22.jsaction,t-1otPa01IQM8,0.aria-label,0.data-tooltip\"]"));
    }
    public WebElement restaurantOnTheWay() {
        return driver.findElement(By.xpath("//div[@class=\"Qowlfc fCbqBc\"][@style=\"width:48px;height:48px;background-color:#188038\"]"));
    }
    public WebElement rollDown() {
        return driver.findElement(By.xpath("//div[@jsan=\"t-dgE5uNmzjiE,7.m6QErb,7.DxyBCb,7.kA9KIf,7.dS8AEf,7.ecceSd,7.QjC7t,0.aria-label,0.role,0.tabindex\"]"));
    }
    public WebElement toCozyBar() {
        return driver.findElement(By.xpath("//a[@aria-label=\"S&S Cozy bar\"]"));
    }
    public WebElement leaveRestaurant() {
        return driver.findElement(By.xpath("//a[@class=\"gscp_a\"]"));
    }
    public WebElement changeDestination() {
        return driver.findElement(By.xpath("//div[@class=\"PLEQOe reverse\"]"));
    }
    public WebElement elemOne() {
        return driver.findElement(By.xpath("//div[@class=\"d1qxPd\"]/button"));
    }
    public WebElement elemTwo() {
        return driver.findElement(By.xpath("//img[@id=\"section-directions-trip-travel-mode-0\"]"));
    }
    public WebElement menuButton() {
        return driver.findElement(By.xpath("//div[@class=\"fKm1Mb\"][@jsan=\"7.fKm1Mb,t-Sq0C1nRBjnU\"]"));
    }
    public WebElement directory() {
        return driver.findElement(By.xpath("//button[@class=\"T2ozWe\"][@jsaction=\"settings.help\"]"));
    }
    public WebElement searchInDirectory() {
        return driver.findElement(By.xpath("//input[@class=\"help-panel-header__search-input\"][@placeholder=\"Поиск в Справке\"]"));
    }
    public WebElement foundInDirectory() {
        return driver.findElement(By.xpath("//span[@class=\"help-panel-search-result__text\"]/span[.='Начало работы с Google Картами']"));
    }
    public WebElement closeDirectory() {
        return driver.findElement(By.xpath("//button[@class=\"help-panel-header__close-button\"]"));
    }
    public WebElement searchSettings() {
        return driver.findElement(By.xpath("//button[@class=\"T2ozWe\"][@jsaction=\"settings.link.settings\"]"));
    }
    public WebElement safeSearch() {
        return driver.findElement(By.xpath("//div[@class=\"sliderbox\"]/div/span/div[@class=\"jfk-checkbox-checkmark\"]"));
    }
    public WebElement resultsPerPage() {
        return driver.findElement(By.xpath("//div[@class=\"goog-slider goog-slider-horizontal\"]"));
    }
    public WebElement noPopularQueries() {
        return driver.findElement(By.xpath("//div[3]/div[@class=\"URIeEf\"]/div[2]/span[@class=\"jfk-radiobutton-radio\"]"));
    }
    public WebElement announcementResults() {
        return driver.findElement(By.xpath("//div[4]/div[@class=\"URIeEf\"]/div[@aria-checked=\"false\"]/span[@class=\"jfk-radiobutton-radio\"]"));
    }
    public WebElement resultsIn() {
        return driver.findElement(By.xpath("//div[@id=\"nwc\"]/span/div[@role=\"presentation\"]"));
    }
    public WebElement regionSelection() {
        return driver.findElement(By.xpath("//span[@style=\"border-top-color:#1a0dab\"]"));
    }
    public WebElement regionSelectionUkraine() {
        return driver.findElement(By.xpath("//div[@data-value=\"UA\"]/span[@class=\"jfk-radiobutton-radio\"]"));
    }
    public WebElement doNotStore() {
        return driver.findElement(By.xpath("//div[@id=\"form-buttons\"]/div[@style=\"user-select: none;\"][2]"));
    }

    public void clickHowToGetButton() {
        howToGetButton().click();
    }
    public void writeWherefrom() {
        wherefrom().clear();
        wherefrom().sendKeys("02000, Киев\n");
    }
    public void writeGoTo() {
        goTo().sendKeys("Бровары, Киевская область\n");
    }
    public void clickRestaurantOnTheWay() {
        restaurantOnTheWay().click();
    }
    public void clickLeaveRestaurant() {
        leaveRestaurant().click();
    }
    public void clickByPublicTransport() {
        byPublicTransport().click();
    }
    public void clickChangeDestination() {
        changeDestination().click();
    }
    public void writeTwoGoTo() {
        goTo().sendKeys("Калиновка, Киевская область, 07443\n");
    }
    public void clickMenuButton() {
        menuButton().click();
    }
    public void clickDirectory() {
        directory().click();
    }
    public void writeSearchInDirectory() {
        searchInDirectory().click();
        searchInDirectory().sendKeys("Начало работы с Google Картами\n");
    }
    public void clickFoundInDirectory() {
        foundInDirectory().click();
    }
    public void clickCloseDirectory() {
        closeDirectory().click();
    }
    public void clickSearchSettings() {
        searchSettings().click();
    }
    public void clickSafeSearch() {
        safeSearch().click();
    }
    public void clickResultsPerPage() {
        resultsPerPage().click();
    }
    public void clickNoPopularQueries() {
        noPopularQueries().click();
    }
    public void goToCozyBar() {
        toCozyBar().click();
    }
    public void clickAnnouncementResults() {
        announcementResults().click();
    }
    public void clickResultsIn() {
        resultsIn().click();
    }
    public void clickMoreRegionSelection() {
        regionSelection().click();
    }
    public void clickRegionSelectionUkraine() {
        regionSelectionUkraine().click();
    }
    public void clickDoNotStore() {
        doNotStore().click();
    }
    public void enter() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ENTER);
    }
    public void searchAuditGoogleMap() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com.ua/preferences?hl=ru&prev=https%3A%2F%2Fwww.google.com.ua%2Fmaps%3Fhl%3Dru#location");
    }
}
