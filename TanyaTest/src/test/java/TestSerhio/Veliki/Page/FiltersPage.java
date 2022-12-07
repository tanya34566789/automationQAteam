package TestSerhio.Veliki.Page;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FiltersPage extends BasePage {
    public FiltersPage(WebDriver driver) {
        super(driver);
    }
    public void goToVeliki() {
        driver.get("https://veliki.com.ua/");
    }
    public WebElement velikiUa() {
        return findElementByXpath("//span[@class = 'cur']");
    }
    public WebElement filterSport() {
        return findElementByXpath("//a//img[contains (@alt, 'Спорт та фітнес')]");
    }
    public WebElement filterTrainers() {
        return findElementByXpath("//img[@alt=\"Тренажери\"]");
    }
    public WebElement filterCardioTrainer() {
        return findElementByXpath("//img[@alt=\"Кардіотренажери\"]");
    }
    public WebElement filterHouseFit() {
        return findElementByXpath("//li//a[contains (@href, 'HouseFit')]");
    }
    public WebElement cardioHouseFit() {
        return findElementByXpath("//div//h1[contains (text(), 'House')]");
    }
    public WebElement fieldMinPrice() {
        return findElementByXpath("//input [@id = 'filterprice_min']");
    }
    public WebElement fieldMaxPrice() {
        return findElementByXpath("//input [@id = 'filterprice_max']");
    }
    public WebElement fieldButtonOkMinMaxPrice() {
        return findElementByXpath("//div[@class=\"frange\"]//button");
    }
}
