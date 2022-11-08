package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class basket2aPage extends BasePage {
    public basket2aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement catalogBeautyAndHealth() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/shop/krasota-i-zdorove/')]");
    }

    public WebElement catalogButton() {
        return findElementByXpath("//div[contains(@class,'header__menu-opener-button-text')]");
    }

    public WebElement fieldBeautyAndHealth() {
        return findElementByXpath("//h1[contains(.,'Краса та здоров')]");
    }

    public WebElement catalogHairCare() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/ukhod-za-volosami/')]");
    }

    public WebElement catalogShampoo() {
        return findElementByXpath("//a[contains(@class,'shop-category__title link link--big link--inverted nc')][contains(@href,'https://epicentrk.ua/ua/shop/shampuni/')]");
    }

    public WebElement fieldShampoo() {
        return findElementByXpath("//h1[contains(.,'Шампунь')]");
    }

    public WebElement buttonAddToCartOne() {
        return findElementByXpath("//button[contains(@data-add-to-cart,'Pantene Pro-V')]");
    }

    public WebElement closeBasket() {
        return findElementByXpath("//button[contains(@class,'fancybox-button fancybox-close-small')]");
    }

    public WebElement buttonAddToCartTwo() {
        return findElementByXpath("//button[contains(@data-gtm-params,'\"product_id\":\"002355731\"')]");
    }

    public WebElement removeAllGoods() {
        return findElementByXpath("//a[contains(@class,'link link--inverted basket__remove-all')]");
    }

    public WebElement removeGoodsYep() {
        return findElementByXpath("//button[@class=\"btn btn--white\"]");
    }

    public WebElement fieldEmptyBasket() {
        return findElementByXpath("//p[contains(@class,'basket-empty__message')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goCatalog() {
        catalogButton().click();
        catalogBeautyAndHealth().click();
        Assert.assertTrue(fieldBeautyAndHealth().isDisplayed());
    }

    public void goShampoo() {
        catalogHairCare().click();
        catalogShampoo().click();
        Assert.assertTrue(fieldShampoo().isDisplayed());
    }

    public void addToBasket() {
        buttonAddToCartOne().click();
        closeBasket().click();
        buttonAddToCartTwo().click();
    }

    public void removeGoodsFromBasket() {
        removeAllGoods().click();
        removeGoodsYep().click();
        Assert.assertTrue(fieldEmptyBasket().isDisplayed());
    }
}
