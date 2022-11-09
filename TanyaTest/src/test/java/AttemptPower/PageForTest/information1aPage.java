package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class information1aPage extends BasePage {
    public information1aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonInformation() {
        return findElementByXpath("//div[contains(@class,'header__info-toggle-text')]");
    }

    public WebElement buttonAddressesCenters() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/market/')]");
    }

    public WebElement fieldAddressesCenters() {
        return findElementByXpath("//h1[contains(.,'Торговельні центри Епіцентр')]");
    }

    public WebElement addressesCentersKyiv() {
        return findElementByXpath("//a[contains(@href,'ua/market/kiev')]");
    }

    public WebElement addressesCentersKyivPolar() {
        return findElementByXpath("//header[contains(@class,'_oMrF5a')]//a[contains(@href,'ua/market/epicentr-kiev-polyarnaya.html')]");
    }

    public WebElement fieldEpicentrKyivPolar() {
        return findElementByXpath("//h1[contains(.,'Епіцентр Київ, вул. Полярна, 20-Д')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goInformation() {
        buttonInformation().click();
        buttonAddressesCenters().click();
        Assert.assertTrue(fieldAddressesCenters().isDisplayed());
    }

    public void goInformationAddress() {
        addressesCentersKyiv().click();
        addressesCentersKyivPolar().click();
        Assert.assertTrue(fieldEpicentrKyivPolar().isDisplayed());
    }
}
