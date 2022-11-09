package AttemptPower.PageForTest;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class information3aPage extends BasePage {
    public information3aPage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonInformation() {
        return findElementByXpath("//div[contains(@class,'header__info-toggle-text')]");
    }

    public WebElement buttonQuestionsAnswers() {
        return findElementByXpath("//div/a[contains(@href,'https://epicentrk.ua/ua/info/faq/')]");
    }

    public WebElement fieldQuestionsAnswers() {
        return findElementByXpath("//span[contains(.,'Запитання та відповіді')][contains(@class,'faq-title__text')]");
    }

    public WebElement fieldDescribeQuestion() {
        return findElementByXpath("//input[contains(@class,'input _yPSlM6')]");
    }

    public WebElement fieldSearchResults() {
        return findElementByXpath("//p[contains(@class,'faq-search__title')][contains(.,'Акції')]");
    }

    public WebElement searchResultsPromotions() {
        return findElementByXpath("//a[contains(@href,'/ua/faq/znyzhky-ta-ekonomiya/yak-diznatys-pro-vsi-isnuyuchi-aktsiyi-lang-kak-uznat-o-vsekh-deystvuyushchykh-aktsyyakh.html')]");
    }

    public WebElement searchFieldResultsDelivery() {
        return findElementByXpath("//a[contains(@href,'/ua/faq/adresna-dostavka-po-ukrayini/kakaya-stoymost-dostavky-v-regyonakh-lang-yaka-vartist-dostavky-v-regionakh.html')]");
    }

    public void goToEpicentr() {
        driver.get("https://epicentrk.ua/ua/shop/compare/");
    }

    public void goQuestionsAnswers() {
        buttonInformation().click();
        buttonQuestionsAnswers().click();
        Assert.assertTrue(fieldQuestionsAnswers().isDisplayed());
        fieldDescribeQuestion().sendKeys("Акції\n");
        Assert.assertTrue(fieldSearchResults().isDisplayed());
        searchResultsPromotions().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://epicentrk.ua/ua/faq/znyzhky-ta-ekonomiya/yak-diznatys-pro-vsi-isnuyuchi-aktsiyi-lang-kak-uznat-o-vsekh-deystvuyushchykh-aktsyyakh.html");
        fieldDescribeQuestion().sendKeys("Доставка");
        searchFieldResultsDelivery().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://epicentrk.ua/ua/faq/adresna-dostavka-po-ukrayini/kakaya-stoymost-dostavky-v-regyonakh-lang-yaka-vartist-dostavky-v-regionakh.html");
    }
}
