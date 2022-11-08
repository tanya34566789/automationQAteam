package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class comparison2aPage extends BasePage {
    public comparison2aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogTools() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/instrumenty-i-oborudovanie/')]");
    }

    public WebElement catalogPowerTools() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/elektroinstrumenty/')]");
    }

    public WebElement catalogScrewdrivers() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/shurupoverty/')]");
    }

    public WebElement fieldScrewdrivers() {
        return findElementByXpath("//h1[contains(.,'Шуруповерти')]");
    }

    public WebElement comparisonED103() {
        return findElementByXpath("//a[contains(@onclick,'000037376')][contains(@class,'btn js-tooltip-bottom')]");
    }

    public WebElement comparisonABS12() {
        return findElementByXpath("//a[contains(@onclick,'002090063')][contains(@class,'btn js-tooltip-bottom')]");
    }

    public WebElement comparisonButton() {
        return findElementByXpath("//span[contains(@class,'header__compare-link-icon')]");
    }

    public WebElement comparisonRemoveED103() {
        return findElementByXpath("//a[contains(@class,'btn-round-close compare-remove')][contains(@onclick,'000037376')]");
    }

    public WebElement comparisonRemoveABS12() {
        return findElementByXpath("//a[contains(@class,'btn-round-close compare-remove')][contains(@onclick,'002090063')]");
    }

    public WebElement fieldNothingInComparison() {
        return findElementByXpath("//h1[contains(@class,'headline headline--level2')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/");
    }

    public void goCatalogScrewdrivers() {
        catalogButton().click();
        catalogTools().click();
        catalogPowerTools().click();
        catalogScrewdrivers().click();
        Assert.assertTrue(fieldScrewdrivers().isDisplayed());
    }

    public void goAddInComparison() {
        comparisonED103().click();
        comparisonABS12().click();
        comparisonButton().click();
    }

    public void goRemoveInComparison() {
        comparisonRemoveED103().click();
        comparisonRemoveABS12().click();
        Assert.assertTrue(fieldNothingInComparison().isDisplayed());
    }
}
