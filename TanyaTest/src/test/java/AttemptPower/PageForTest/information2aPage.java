package AttemptPower.PageForTest;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class information2aPage extends BasePage {
    public information2aPage(WebDriver driver) {
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

    public WebElement buttonContacts() {
        return findElementByXpath("//a[contains(@href,'https://epicentrk.ua/ua/info/contacts/')][contains(@class,'is-red')]");
    }

    public WebElement fieldContacts() {
        return findElementByXpath("//h1[contains(.,'Контакти')]");
    }

    public WebElement buttonHowPlaceOrder() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/instrukciya-oformlennya-samovyvozu/')]");
    }

    public WebElement fieldHowPlaceOrder() {
        return findElementByXpath("//h1[contains(.,'САМОВИВІЗ')]");
    }

    public WebElement buttonServices() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/poslugy/')]");
    }

    public WebElement fieldServices() {
        return findElementByXpath("//h1[contains(.,'Послуги')]");
    }

    public WebElement buttonPaymentInInformation() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/paiment/')]");
    }

    public WebElement fieldPaymentInInformation() {
        return findElementByXpath("//h1[contains(.,'Способи оплати товару')]");
    }

    public WebElement buttonDelivery() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/delivery/')]");
    }

    public WebElement fieldDelivery() {
        return findElementByXpath("//h1[contains(.,'Доставка товару')]");
    }

    public WebElement buttonGuarantee() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/garanty/')]");
    }

    public WebElement fieldGuarantee() {
        return findElementByXpath("//h1[contains(.,'Гарантія та сервіс')]");
    }

    public WebElement buttonProductReturn() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/return/')]");
    }

    public WebElement fieldProductReturn() {
        return findElementByXpath("//h1[contains(.,'Повернення товару')]");
    }

    public WebElement buttonVacancies() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/vakansyy/')]");
    }

    public WebElement fieldVacancies() {
        return findElementByXpath("//h1[contains(.,'Вакансії ТОВ «Епіцентр К»')]");
    }

    public WebElement buttonQuestionsAnswers() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/faq/')]");
    }

    public WebElement fieldQuestionsAnswers() {
        return findElementByXpath("//span[contains(.,'Запитання та відповіді')][contains(@class,'faq-title__text')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goAllInformation() {
        buttonInformation().click();
        buttonAddressesCenters().click();
        Assert.assertTrue(fieldAddressesCenters().isDisplayed());
        buttonInformation().click();
        buttonContacts().click();
        Assert.assertTrue(fieldContacts().isDisplayed());
        buttonInformation().click();
        buttonHowPlaceOrder().click();
        Assert.assertTrue(fieldHowPlaceOrder().isDisplayed());
        buttonInformation().click();
        buttonServices().click();
        Assert.assertTrue(fieldServices().isDisplayed());
        buttonInformation().click();
        buttonPaymentInInformation().click();
        Assert.assertTrue(fieldPaymentInInformation().isDisplayed());
        buttonInformation().click();
        buttonDelivery().click();
        Assert.assertTrue(fieldDelivery().isDisplayed());
        buttonInformation().click();
        buttonGuarantee().click();
        Assert.assertTrue(fieldGuarantee().isDisplayed());
        buttonInformation().click();
        buttonProductReturn().click();
        Assert.assertTrue(fieldProductReturn().isDisplayed());
        buttonInformation().click();
        buttonVacancies().click();
        Assert.assertTrue(fieldVacancies().isDisplayed());
        buttonInformation().click();
        buttonQuestionsAnswers().click();
        Assert.assertTrue(fieldQuestionsAnswers().isDisplayed());
    }
}
