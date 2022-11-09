package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class sorting1aPage extends BasePage {
    public sorting1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogElectronics() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/elektronika/')][contains(@class,'menu-link')]");
    }

    public WebElement fieldElectronics() {
        return findElementByXpath("//h1[contains(.,'Електроніка')]");
    }

    public WebElement catalogMobilePhones() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/mobilnyye-telefony/')]");
    }

    public WebElement catalogSmartphones() {
        return findElementByXpath("//a[contains(@style,'background-image: url(/upload/mf/277/smartphones2.png)')]");
    }

    public WebElement fieldSmartphones() {
        return findElementByXpath("//h1[contains(.,'Смартфони')]");
    }

    public WebElement buttonSeller() {
        return findElementByXpath("//input[contains(@data-filter-element,'epicentr')]/parent::label/child::span");
    }

    public WebElement fieldFilterSeller() {
        return findElementByXpath("//div[contains(@data-checked-value,'epicentr')]");
    }

    public WebElement buttonBrand() {
        return findElementByXpath("//label//a[contains(@href,'/shop/smartfony-i-mobilnye-telefony/fs/brend-alcatel/')]/parent::span");
    }

    public WebElement fieldFilterBrand() {
        return findElementByXpath("//div[contains(@data-parent-name,'brand')]");
    }

    public WebElement buttonDiagonal() {
        return findElementByXpath("//label//a[contains(@href,'/shop/smartfony-i-mobilnye-telefony/fs/diagonal-617/')]/parent::span");
    }

    public WebElement fieldFilterDiagonal() {
        return findElementByXpath("//div[contains(@data-parent-name,'11712')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void goCatalogElectronics() {
        catalogButton().click();
        catalogElectronics().click();
        Assert.assertTrue(fieldElectronics().isDisplayed());
    }

    public void goCatalogSmartphones() {
        catalogMobilePhones().click();
        catalogSmartphones().click();
        Assert.assertTrue(fieldSmartphones().isDisplayed());
    }

    public void goSmartphonesFilter() {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@data-filter-element,'epicentr')]/parent::label/child::span")));
        buttonSeller().click();
        Assert.assertTrue(fieldFilterSeller().isDisplayed());
        refresh();
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//label//a[contains(@href,'/shop/smartfony-i-mobilnye-telefony/fs/brend-alcatel/')]/parent::span")));
        buttonBrand().click();
        Assert.assertTrue(fieldFilterBrand().isDisplayed());
        refresh();
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//label//a[contains(@href,'/shop/smartfony-i-mobilnye-telefony/fs/diagonal-617/')]/parent::span")));
        buttonDiagonal().click();
        Assert.assertTrue(fieldFilterDiagonal().isDisplayed());
    }
}
