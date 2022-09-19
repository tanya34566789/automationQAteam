package TanyaTestFoxtrot.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoxtrotHomePage extends BasePage{

    public FoxtrotHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateFoxtrot() {
        driver.get("https://www.foxtrot.com.ua/");
    }
    public WebElement getLogoImage() {

        return findElementByXpath("//div[@class='header-logo']");
    }
    public WebElement getItems() {

        return findElementByXpath("//div[@class='header__sub-tablet-items']");
    }
    public WebElement getSearchField() {
        return findElementByXpath("//input[@class='header-search__field evinent-search-input']");
    }
    public WebElement getPrice() {

        return findElementByXpath("//input[@class='amount-1']");
    }
    public WebElement getPriceOk() {
        return findElementByXpath("//input[@class='listing__sidebar-range-submit button btn-submit']");
    }
    public WebElement getSamsungA() {
        return findElementByXpath("//a[.='Смартфон SAMSUNG Galaxy A52 4/128 Duos Awesome White (SM-A525FZWDSEK)']");
    }
    public WebElement getBuyBtn() {
        return findElementByXpath("//div[@class='button product-box__main-buy__button buy-button product-buy-button']");
    }
    public WebElement getBasketIcon() {
        return findElementByXpath("(//div[@class='header-tooltip-footer__col'])[2]");
    }
    public WebElement getIcon() {
        return findElementByXpath("//div[@id = 'group-9501']//child::i");
    }
    public List<WebElement> getBrand() {
        return findElementsByXpath("//label[contains(@for, 'sidebar-check-input-9501')]");
    }
}

