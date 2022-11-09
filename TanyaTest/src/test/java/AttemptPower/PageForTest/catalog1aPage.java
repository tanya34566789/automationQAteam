package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class catalog1aPage extends BasePage {
    public catalog1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogLighting() {
        return findElementByXpath("//div[contains(@class,'catalog-menu__level-1-link')]//a[contains(@href,'https://epicentrk.ua/ua/shop/osveshcheniye/')]");
    }

    public WebElement fieldLighting() {
        return findElementByXpath("//header[@class=\"shop-categories__header\"]//h1[contains(.,'Освітлення')] ");
    }

    public WebElement buttonTableLamps() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/nastolnye-lampy/')]");
    }

    public WebElement fieldTableLamps() {
        return findElementByXpath("//h1[contains(.,'Настільні лампи')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goCatalog() {
        catalogButton().click();
        catalogLighting().click();
        Assert.assertTrue(fieldLighting().isDisplayed());
    }

    public void goTableLamps() {
        buttonTableLamps().click();
        Assert.assertTrue(fieldTableLamps().isDisplayed());
    }

}
