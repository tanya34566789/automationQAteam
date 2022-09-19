package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class catalog2aPage extends BasePage {
    public catalog2aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogStationery() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/kantstovary/')][contains(@class,'menu-link')]");
    }

    public WebElement fieldStationery() {
        return findElementByXpath("//h1[contains(.,'Канцтовари')]");
    }

    public WebElement catalogPage() {
        return findElementByXpath("//li[contains(@id,'breadcrumb_2')]//span[contains(@class,'breadcrumbs__text')]");
    }

    public WebElement inPageCatalogStationery() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/kantstovary/')][contains(@class,'shop-category__title link link--big link--inverted nc')]");
    }

    public WebElement buttonEpicentr() {
        return findElementByXpath("//li[contains(@id,'breadcrumb_1')]//span[contains(@class,'breadcrumbs__text')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goCatalog() {
        catalogButton().click();
        catalogStationery().click();
        Assert.assertTrue(fieldStationery().isDisplayed());
    }

    public void goCatalogPage() {
        catalogPage().click();
        inPageCatalogStationery().click();
        Assert.assertTrue(fieldStationery().isDisplayed());
    }

    public void goEpicentrPage() {
        buttonEpicentr().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://epicentrk.ua/");
    }
}
