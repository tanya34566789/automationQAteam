package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class comparison3aPage extends BasePage {
    public comparison3aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogElectronics() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/elektronika/')]");
    }

    public WebElement catalogMobilePhones() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/mobilnyye-telefony/')]");
    }

    public WebElement catalogSmartphones() {
        return findElementByXpath("//a[contains(@href,'/ua/shop/smartfony-i-mobilnye-telefony/')]");
    }

    public WebElement fieldSmartphones() {
        return findElementByXpath("//h1[contains(.,'Смартфони')]");
    }

    public WebElement comparisonGalaxyM32() {
        return findElementByXpath("//a[contains(@onclick,'002748782')][contains(@href,'javascript:')]");
    }

    public WebElement catalogComputerOfficeEquipment() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/kompyuternaya-i-ofisnaya-tekhnika/')][contains(@class,'shop-category__title link link--big link--inverted nc')]");
    }

    public WebElement catalogLaptops() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/noutbuki/')]");
    }

    public WebElement fieldLaptops() {
        return findElementByXpath("//h1[contains(.,'Ноутбуки')]");
    }

    public WebElement comparisonLenovoV14() {
        return findElementByXpath("//a[contains(@onclick,'003117668')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonButton() {
        return findElementByXpath("//span[contains(@class,'header__compare-link-icon')]");
    }

    public WebElement comparisonFieldSmartphones() {
        return findElementByXpath("//h3[contains(@class,'headline headline--18')][contains(.,'Смартфони')]");
    }

    public WebElement comparisonFieldLaptops() {
        return findElementByXpath("//h3[contains(@class,'headline headline--18')][contains(.,'Ноутбуки')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/");
    }


    public void goCatalogSmartphones() {
        catalogButton().click();
        catalogElectronics().click();
        catalogMobilePhones().click();
        catalogSmartphones().click();
        Assert.assertTrue(fieldSmartphones().isDisplayed());
        comparisonGalaxyM32().click();
    }

    public void goCatalogLaptops() {
        catalogButton().click();
        catalogElectronics().click();
        catalogComputerOfficeEquipment().click();
        catalogLaptops().click();
        Assert.assertTrue(fieldLaptops().isDisplayed());
        comparisonLenovoV14().click();
    }

    public void goCatalogComparison() {
        comparisonButton().click();
        Assert.assertTrue(comparisonFieldSmartphones().isDisplayed());
        Assert.assertTrue(comparisonFieldLaptops().isDisplayed());
    }
}
