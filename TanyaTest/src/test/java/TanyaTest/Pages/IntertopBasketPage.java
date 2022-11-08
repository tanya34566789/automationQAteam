package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IntertopBasketPage extends BasePage {
    public IntertopBasketPage(WebDriver driver) {
        super(driver);
    }

    public void navigateIntertop() {
        driver.get("https://intertop.ua/");
    }

    public WebElement buttonWomen() {
        return waitElementToBeClickable("//div[@class='main-menu-top flex flex-center-v']//a[@href='/zhenshinam/']");
    }

    public WebElement buttonSale() {
        return waitElementToBeClickable("//div[@class='menu-item']//span[contains(text(), 'Знижки')]");
    }

    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

    public WebElement openProduct() {
        return waitElementToBeClickable("//div[@class='product-thumb']//img[@src='https://intertop.ua/load/7P75/412x550/1.jpg']");
    }

    public WebElement getSize() {
        return waitElementToBeClickable("//label[@class='jsShowPrice btn  ']//span[contains(text(), 'M')]");
    }

    public WebElement buttonBuy() {
        return waitElementToBeClickable("//span[@id='basket_add_preview']");
    }

    public WebElement openProduct2() {
        return waitElementToBeClickable("//div[@class='product-thumb']//img[@src='https://intertop.ua/load/7P71/412x550/MAIN.jpg']");
    }

    public WebElement getSize2() {
        return waitElementToBeClickable("//label[@data-eyezon-title='Демісезонна куртка EA7 Модель 6HTB15-TNG9Z-1200 / 7P71 / M']");
    }

    public WebElement buttonBuy2() {
        return waitElementToBeClickable("//span[@id='basket_add_preview']");
    }

    public WebElement basketWindow() {
        return waitElementToBeClickable("//div[@class='intertop-basket-popup']");

    }

    public WebElement pressPlus() {
        return waitElementToBeClickable("//div[@class='basket-controls__up basket-controls__button'][1]");
    }

    public WebElement pressDelete() {
        return waitElementToBeClickable("//div[@class='basket-item-in sizes_hidden']//div[@class='basket-item__remove del-ico'][1]");
    }

    public WebElement pressYes() {
        return waitElementToBeClickable("//span[@class='font-semibold font-secondary-active']");
    }

    public WebElement pressDelete2() {
        return waitElementToBeClickable("//div[@class='basket-item-in sizes_hidden']//div[@class='basket-item__remove del-ico'][1]");

    }

    public WebElement pressYes2() {
        return waitElementToBeClickable("//span[@class='font-semibold font-secondary-active']");
    }

    public WebElement emptyBasket() {
        return waitElementToBeClickable(" //div[@class='intertop-basket-popup empty_popup']");
    }
}
