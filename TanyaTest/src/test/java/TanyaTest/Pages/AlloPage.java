package TanyaTest.Pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloPage extends BasePage {
    public AlloPage(WebDriver driver) {
        super(driver);
    }

    public void navigateAllo() {
        driver.get("https://allo.ua/");
    }

    public WebElement buttonShops() {
        return waitElementToBeClickable("//div[@class='mh-links']//a[contains(text(), 'Магазини')]");
    }

    public WebElement buttonKyiv() {
        return waitElementToBeClickable("//div[@class='mh-links']//a[contains(text(), 'Магазини')]");
    }

    public WebElement buttonFilter() {
        return waitElementToBeClickable("//button[@title='Показати таблицю']");
    }

    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
    public WebElement buttonShares() {
        return waitElementToBeClickable("//div[@class='mh-links']//a[contains(text(), 'Акції')]");
    }
    public WebElement buttonPresents() {
        return waitElementToBeClickable("//div[@class='promo-list__categories']//span[contains(text(), 'Подарунки')]");
    }
    public WebElement buttonAirСonditioners() {
        return waitElementToBeClickable("//div[@class='promo-list__items']//img[@alt='На кондиціонери Midea знижка на встановлення до 50% + Wi-Fi модуль!']");
    }
    public List<WebElement> buttonCompare() {

        return waitVisibilityOfAllElementsLocatedBy("//div[@class='compare']");
    }
    public WebElement Compare() {
        return waitElementToBeClickable("//a[@class='mh-button mh-compare']");
    }
}
