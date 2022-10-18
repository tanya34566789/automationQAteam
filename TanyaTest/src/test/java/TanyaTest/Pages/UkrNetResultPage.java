package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UkrNetResultPage extends BasePage {
    public UkrNetResultPage(WebDriver driver) {
        super(driver);
    }
    public void navigateUkrNet() {
        driver.get("https://www.ukr.net/");
    }
    public WebElement buttonMain() {
        return waitElementToBeClickable("//h2[@class='feed__section--title']//a[contains(text(), 'Головне')]");
    }
    public WebElement buttonPolitika() {
        return waitElementToBeClickable("//h2[@class='feed__section--title']//a[contains(text(), 'Політика')]");
    }
    public WebElement buttonEkonomika() {
        return waitElementToBeClickable("//h2[@class='feed__section--title']//a[contains(text(), 'Економіка')]");
    }
    public WebElement buttonEvents() {
        return waitElementToBeClickable("//h2[@class='feed__section--title']//a[contains(text(), 'Події')]");
    }
}
