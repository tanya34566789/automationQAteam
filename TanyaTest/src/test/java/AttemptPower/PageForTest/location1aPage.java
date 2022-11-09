package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class location1aPage extends BasePage {
    public location1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonLocation() {
        return findElementByXpath("//div[contains(@class,'header__locations-opener')]");
    }

    public WebElement searchFieldLocation() {
        return findElementByXpath("//div[contains(@data-test,'search-open')]");
    }

    public WebElement inputSearchFieldLocation() {
        return findElementByXpath("//input[contains(@data-test,'search-city')]");
    }

    public WebElement choiceLocation() {
        return findElementByXpath("//div[contains(.,'Тернопіль, вул. Поліська, 7')][@data-store-address]/parent::div/parent::div/parent::div/parent::div/child::button");
    }

    public WebElement fieldLocationOnPage() {
        return findElementByXpath("//div[contains(@class,'header__locations')]/div[contains(@class,'header__locations-opener')]/div[contains(@title,'Тернопіль')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goLocation() {
        buttonLocation().click();
        searchFieldLocation().click();
        inputSearchFieldLocation().sendKeys("Ternopil\n");
        inputSearchFieldLocation().clear();
        inputSearchFieldLocation().sendKeys("Тернопіль\n");
        choiceLocation().click();
        Assert.assertTrue(fieldLocationOnPage().isDisplayed());
    }
}
