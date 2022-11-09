package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class comparison4aPage extends BasePage {
    public comparison4aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogPharmacy() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/apteka/')]");
    }

    public WebElement catalogHomePharmacy() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/domashnyaya-apteka/')]");
    }

    public WebElement catalogBactericidalLamps() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/bakteritsidnye-lampy/')]");
    }

    public WebElement fieldBactericidalLamps() {
        return findElementByXpath("//h1[contains(.,'Бактерицидні лампи')]");
    }

    public WebElement comparisonLedvanceUVC32W() {
        return findElementByXpath("//a[contains(@onclick,'002161701')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonOKLAN() {
        return findElementByXpath("//a[contains(@onclick,'MP7393076')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonDX1001() {
        return findElementByXpath("//a[contains(@onclick,'MP5430668')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonButton() {
        return findElementByXpath("//span[contains(@class,'header__compare-link-icon')]");
    }

    public WebElement comparisonFuctionButton() {
        return findElementByXpath("//header/a[contains(@href,'/ua/shop/compare/?sect=6830')]");
    }

    public WebElement fieldComparison() {
        return findElementByXpath("//a[contains(@class,'epicentrk-compare-table__list-item epicentrk-compare-table__list-item--active')][contains(.,'Бактерицидні лампи')]");
    }

    public WebElement fieldLedvanceUVC32W() {
        return findElementByXpath("//h3[contains(@class,'table-item__title epicentrk-compare-table__table-item-headline')][contains(.,'Ledvance УФ-С 32 Вт')]");
    }

    public WebElement fieldOKLAN() {
        return findElementByXpath("//h3[contains(@class,'table-item__title epicentrk-compare-table__table-item-headline')][contains(.,'OKLAN')]");
    }

    public WebElement fieldDX1001() {
        return findElementByXpath("//h3[contains(@class,'table-item__title epicentrk-compare-table__table-item-headline')][contains(.,'DX 1001')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/");
    }

    public void goCatalogBactericidalLamps() {
        catalogButton().click();
        catalogPharmacy().click();
        catalogHomePharmacy().click();
        catalogBactericidalLamps().click();
        Assert.assertTrue(fieldBactericidalLamps().isDisplayed());
    }

    public void goAddInComparison() {
        comparisonLedvanceUVC32W().click();
        comparisonOKLAN().click();
        comparisonDX1001().click();
        comparisonButton().click();
    }

    public void goFuctionComparison() {
        comparisonFuctionButton().click();
        Assert.assertTrue(fieldComparison().isDisplayed());
        Assert.assertTrue(fieldLedvanceUVC32W().isDisplayed());
        Assert.assertTrue(fieldOKLAN().isDisplayed());
        Assert.assertTrue(fieldDX1001().isDisplayed());
    }
}
