package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class sorting3aPage extends BasePage {
    public sorting3aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogHouseholdAppliances() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/bytovaya-tekhnika/')]");
    }

    public WebElement catalogEquipmentForCooking() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/tekhnika-dlya-prigotovleniya-pishchi/')][contains(@class,'shop-category__title link link--big link--inverted nc')]");
    }

    public WebElement catalogBlenders() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/blendery/')][contains(@class,'shop-category__title link link--big link--inverted nc')]");
    }

    public WebElement fieldBlenders() {
        return findElementByXpath("//h1[contains(.,'Блендери')]");
    }

    public WebElement buttonSeller() {
        return findElementByXpath("//input[contains(@data-filter-element,'epicentr')]/parent::label/child::span");
    }

    public WebElement buttonBrand() {
        return findElementByXpath("//label//a[contains(@href,'/shop/blendery/fs/brend-ariete/')]/parent::span");
    }

    public WebElement fieldPriceSortTo() {
        return findElementByXpath("//input[contains(@name,'name_max')]");
    }

    public WebElement fieldPriceSortFrom() {
        return findElementByXpath("//input[contains(@name,'name_min')][contains(@data-slider-id,'price')]");
    }

    public WebElement buttonType() {
        return findElementByXpath("//a[contains(@href,'/shop/blendery/fs/tip-stacionarnyy/')]/parent::span");
    }

    public WebElement removeFilterBrand() {
        return findElementByXpath("//div[contains(@data-parent-name,'brand')]/span[contains(@class,'checked-items__uncheck-icon')]");
    }

    public WebElement removeAllFilter() {
        return findElementByXpath("//span[contains(@class,'checked-items__uncheck-icon uncheck-all__icon')]");
    }

    public void sleepMillis(int millis) {
        try {
            Thread.sleep(millis * 1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goCatalogBlenders() {
        catalogButton().click();
        catalogHouseholdAppliances().click();
        catalogEquipmentForCooking().click();
        catalogBlenders().click();
        Assert.assertTrue(fieldBlenders().isDisplayed());
    }

    public void goFilterBlenders() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@data-filter-element,'epicentr')]/parent::label/child::span")));
        buttonSeller().click();
        sleepMillis(500);
        buttonBrand().click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@name,'name_max')]")));
        fieldPriceSortTo().clear();
        fieldPriceSortTo().sendKeys("6000");
        fieldPriceSortFrom().clear();
        fieldPriceSortFrom().sendKeys("1000");
        sleepMillis(500);
        buttonType().click();
    }

    public void goRemoveFilter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-parent-name,'brand')]/span[contains(@class,'checked-items__uncheck-icon')]")));
        removeFilterBrand().click();
        sleepMillis(500);
        removeAllFilter().click();
    }
}
