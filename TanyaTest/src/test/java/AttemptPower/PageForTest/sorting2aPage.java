package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class sorting2aPage extends BasePage {
    public sorting2aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogElectronics() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/elektronika/')][contains(@class,'menu-link')]");
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

    public WebElement buttonSortCheap() {
        return findElementByXpath("//a[contains(@href,'/ua/shop/noutbuki/deshevie/')][contains(@class,'btnFiltr changeFilterUrl')]");
    }

    public WebElement fieldPriceSortFrom() {
        return findElementByXpath("//input[contains(@name,'name_min')][contains(@data-slider-id,'price')]");
    }

    public WebElement fieldPriceSortTo() {
        return findElementByXpath("//input[contains(@name,'name_max')]");
    }

    public WebElement fieldFilterPriceSortFrom() {
        return findElementByXpath("//div[contains(@class,'min-price')]/*[contains(.,'10000')]");
    }

    public WebElement fieldFilterPriceSortTo() {
        return findElementByXpath("//div[contains(@class,'max-price')]/*[contains(.,'25000')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goLaptops() {
        catalogButton().click();
        catalogElectronics().click();
        catalogComputerOfficeEquipment().click();
        catalogLaptops().click();
        Assert.assertTrue(fieldLaptops().isDisplayed());
    }

    public void goLaptopsFilter() {
        buttonSortCheap().click();
        fieldPriceSortTo().clear();
        fieldPriceSortTo().sendKeys("25000");
        fieldPriceSortFrom().clear();
        fieldPriceSortFrom().sendKeys("10000");
        Assert.assertTrue(fieldFilterPriceSortFrom().isDisplayed());
        Assert.assertTrue(fieldFilterPriceSortTo().isDisplayed());
    }
}
