package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class comparison1aPage extends BasePage {
    public comparison1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogSportsGoods() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/sportivnye-tovary/')]");
    }

    public WebElement catalogCycling() {
        return findElementByXpath("//li/a[contains(@href,'/ua/shop/velosport/')]");
    }

    public WebElement catalogBicycles() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/velosipedy/')][contains(@class,'shop-category__title link link--big link--inverted nc')]");
    }

    public WebElement fieldBicycles() {
        return findElementByXpath("//h1[contains(.,'Велосипеди')]");
    }

    public WebElement comparisonWolverineBlack() {
        return findElementByXpath("//a[contains(@onclick,'000975695')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonSpiderBlack() {
        return findElementByXpath("//a[contains(@onclick,'002250651')][contains(@href,'javascript:')]");
    }

    public WebElement comparisonButton() {
        return findElementByXpath("//span[contains(@class,'header__compare-link-icon')]");
    }

    public WebElement goodsInComparisonSpider() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/velosiped-maxxpro-12-30-sm-spider-chernyy-spider-ss21-spider-21.html')][contains(@class,'link link--big link--inverted')]");
    }

    public WebElement goodsInComparisonWolverine() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/velosiped-up-underprice-13-wolverine-chernyy.html')][contains(@class,'link link--big link--inverted')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/");
    }

    public void goCatalogBicycles() {
        catalogButton().click();
        catalogSportsGoods().click();
        catalogCycling().click();
        catalogBicycles().click();
        Assert.assertTrue(fieldBicycles().isDisplayed());
    }

    public void goAddInComparison() {
        comparisonWolverineBlack().click();
        comparisonSpiderBlack().click();
        comparisonButton().click();
        Assert.assertTrue(goodsInComparisonSpider().isDisplayed());
        Assert.assertTrue(goodsInComparisonWolverine().isDisplayed());
    }
}
