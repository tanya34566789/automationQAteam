package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class comparison5aPage extends BasePage {
    public comparison5aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogRepair() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/stroitelstvo-i-remont/')]");
    }

    public WebElement catalogDoor() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/dveri/')]");
    }

    public WebElement catalogInteriorDoors() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/dveri-mezhkomnatnye/')]");
    }

    public WebElement fieldInteriorDoors() {
        return findElementByXpath("//h1[contains(.,'Двері міжкімнатні')]");
    }

    public WebElement comparisonAccord3PO() {
        return findElementByXpath("//a[contains(@onclick,'000312763')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonButton() {
        return findElementByXpath("//span[contains(@class,'header__compare-link-icon')]");
    }

    public WebElement comparisonAddMoreButton() {
        return findElementByXpath("//header/a[contains(@href,'/ua/shop/dveri-mezhkomnatnye/')]");
    }

    public WebElement comparisonClassicPG() {
        return findElementByXpath("//a[contains(@onclick,'000586113')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonComfortZS() {
        return findElementByXpath("//a[contains(@onclick,'000046216')][contains(@href,'javascript:')]");
    }

    public WebElement fieldAccord3PO() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/dvernoe-polotno-omis-laminirovannoe-akkord3-po-800-mm-venge.html')][contains(@class,'link link--big link--inverted')]");
    }

    public WebElement fieldClassicPG() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/dvernoe-polotno-omis-klassika-pg-800-mm-pod-pokrasku.html')][contains(@class,'link link--big link--inverted')]");
    }

    public WebElement fieldComfortZS() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/dvernoe-polotno-pvkh-komfort-orekh-ss-800-mm.html')][contains(@class,'link link--big link--inverted')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/");
    }

    public void goCatalogInteriorDoors() {
        catalogButton().click();
        catalogRepair().click();
        catalogDoor().click();
        catalogInteriorDoors().click();
        Assert.assertTrue(fieldInteriorDoors().isDisplayed());
    }

    public void goComparisonAddMore() {
        comparisonAccord3PO().click();
        comparisonButton().click();
        Assert.assertTrue(fieldAccord3PO().isDisplayed());
        comparisonAddMoreButton().click();
        comparisonClassicPG().click();
        comparisonComfortZS().click();
        comparisonButton().click();
        Assert.assertTrue(fieldClassicPG().isDisplayed());
        Assert.assertTrue(fieldComfortZS().isDisplayed());
    }
}
