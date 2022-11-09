package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.Keys;


public class googleMap extends BasePage {
    public googleMap(WebDriver driver) {
        super(driver);
    }
    public WebElement howToGetButton() {
        return findElementByXpath("//img[contains(@src,'//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png')]");
    }
    public WebElement wherefrom() {
        return findElementByXpath("//input[contains(@class,'tactile-searchbox-input')][contains(@aria-controls,'sbsg51')]");
    }
    public WebElement goTo() {
        return findElementByXpath("//input[contains(@class,'tactile-searchbox-input')][contains(@aria-controls,'sbsg52')]");
    }
    public WebElement byPublicTransport() {
        return findElementByXpath("//img[contains(@jsan,'7.OzmNAc,8.src,0.alt,22.jsaction,t-1otPa01IQM8,0.aria-label,0.data-tooltip')]");
    }
    public WebElement restaurantOnTheWay() {
        return findElementByXpath("//div[contains(@class,'Qowlfc fCbqBc')][contains(@style,'width:48px;height:48px;background-color:#188038')]");
    }
    public WebElement rollDown() {
        return findElementByXpath("//div[contains(@jsan,'t-dgE5uNmzjiE,7.m6QErb,7.DxyBCb,7.kA9KIf,7.dS8AEf,7.ecceSd,7.QjC7t,0.aria-label,0.role,0.tabindex')]");
    }
    public WebElement toCozyBar() {
        return findElementByXpath("//a[contains(@aria-label,'S&S Cozy bar')]");
    }
    public WebElement leaveRestaurant() {
        return findElementByXpath("//a[contains(@class,'gscp_a')]");
    }
    public WebElement changeDestination() {
        return findElementByXpath("//div[contains(@class,'PLEQOe reverse')]");
    }
    public WebElement elemOne() {
        return findElementByXpath("//div[contains(@class,'d1qxPd')]/button");
    }
    public WebElement elemTwo() {
        return findElementByXpath("//img[contains(@id,'section-directions-trip-travel-mode-0')]");
    }
    public WebElement menuButton() {
        return findElementByXpath("//div[contains(@class,'fKm1Mb')][contains(@jsan,'7.fKm1Mb,t-Sq0C1nRBjnU')]");
    }
    public WebElement directory() {
        return findElementByXpath("//button[contains(@class,'T2ozWe')][contains(@jsaction,'settings.help')]");
    }
    public WebElement searchInDirectory() {
        return findElementByXpath("//input[contains(@class,'help-panel-header__search-input')][contains(@placeholder,'Поиск в Справке')]");
    }
    public WebElement foundInDirectory() {
        return findElementByXpath("//span[contains(@class,'help-panel-search-result__text')]/span[contains(.,'Google')]");
    }
    public WebElement closeDirectory() {
        return findElementByXpath("//button[contains(@class,'help-panel-header__close-button')]");
    }
    public WebElement searchSettings() {
        return findElementByXpath("//button[contains(@class,'T2ozWe')][contains(@jsaction,'settings.link.settings')]");
    }
    public WebElement safeSearch() {
        return findElementByXpath("//div[contains(@class,'sliderbox')]/div/span/div[contains(@class,'jfk-checkbox-checkmark')]");
    }
    public WebElement resultsPerPage() {
        return findElementByXpath("//div[contains(@class,'goog-slider goog-slider-horizontal')]");
    }
    public WebElement noPopularQueries() {
        return findElementByXpath("//div[3]/div[contains(@class,'URIeEf')]/div[2]/span[contains(@class,'jfk-radiobutton-radio')]");
    }
    public WebElement announcementResults() {
        return findElementByXpath("//div[4]/div[contains(@class,'URIeEf')]/div[contains(@aria-checked,'false')]/span[contains(@class,'jfk-radiobutton-radio')]");
    }
    public WebElement resultsIn() {
        return findElementByXpath("//div[contains(@id,'nwc')]/span/div[contains(@role,'presentation')]");
    }
    public WebElement regionSelection() {
        return findElementByXpath("//span[contains(@style,'border-top-color:#1a0dab')]");
    }
    public WebElement regionSelectionUkraine() {
        return findElementByXpath("//div[contains(@data-value,'UA')]/span[contains(@class,'jfk-radiobutton-radio')]");
    }
    public WebElement doNotStore() {
        return findElementByXpath("//div[contains(@id,'form-buttons')]/div[contains(@style,'user-select: none;')][2]");
    }

    public void clickHowToGetButton() {
        howToGetButton().click();
        wherefrom().clear();
        wherefrom().sendKeys("02000, Киев\n");
        goTo().sendKeys("Бровары, Киевская область\n");
        byPublicTransport().click();
    }


    public void clickRestaurantOnTheWay() {
        restaurantOnTheWay().click();
    }
    public void clickLeaveRestaurant() {
        leaveRestaurant().click();
    }

    public void clickChangeDestination() {
        changeDestination().click();
        goTo().sendKeys("Калиновка, Киевская область, 07443\n");
    }
    public void clickMenuButton() {
        menuButton().click();
        searchSettings().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com.ua/preferences?hl=ru&prev=https%3A%2F%2Fwww.google.com.ua%2Fmaps%3Fhl%3Dru#location");
        safeSearch().click();
        resultsPerPage().click();
        noPopularQueries().click();
        announcementResults().click();
        resultsIn().click();
        regionSelection().click();
        regionSelectionUkraine().click();
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
    public void goToCozyBar() {
        toCozyBar().click();
    }



    public void clickDoNotStore() {
        doNotStore().click();
    }
    public void enter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        Assert.assertEquals( "Google Карти", driver.getTitle());
    }
//    actions.moveToElement(search).click().build().perform();

}
