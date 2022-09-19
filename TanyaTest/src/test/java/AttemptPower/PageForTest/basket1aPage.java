package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class basket1aPage extends BasePage {
    public basket1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement catalogClothesShoesAccessories() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/odyah-vzuttya-aksesuary/')]");
    }

    public WebElement fieldClothesShoesAccessories() {
        return findElementByXpath("//h1[contains(.,'Одяг, взуття, аксесуари')]");
    }

    public WebElement goToMen() {
        return findElementByXpath("//li[contains(@class,'shop-categories__block')]//a[contains(@href,'/ua/shop/muzhchinam/')]");
    }

    public WebElement goToMensClothing() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/muzhskaya-odezhda/')]");
    }

    public WebElement goToSocksAndGaiters() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/noski-muzhskie/')]");
    }

    public WebElement fieldSocksAndGaiters() {
        return findElementByXpath("//h1[contains(.,'Шкарпетки та гетри чоловічі')]");
    }

    public WebElement buttonAddToCart() {
        return findElementByXpath("//button[contains(@data-add-to-cart,'id\":\"003140783')]");
    }

    public WebElement goodsInBasket() {
        return findElementByXpath("//figcaption//a[contains(.,'Шкарпетки Krokus р. 42-45 в асортименті 1 пар')]");
    }


    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goCatalog() {
        catalogButton().click();
        catalogClothesShoesAccessories().click();
        Assert.assertTrue(fieldClothesShoesAccessories().isDisplayed());
    }

    public void goMensClothing() {
        goToMen().click();
        goToMensClothing().click();
        goToSocksAndGaiters().click();
        Assert.assertTrue(fieldSocksAndGaiters().isDisplayed());
    }

    public void addToCart() {
        buttonAddToCart().click();
        Assert.assertTrue(goodsInBasket().isDisplayed());
    }
}
