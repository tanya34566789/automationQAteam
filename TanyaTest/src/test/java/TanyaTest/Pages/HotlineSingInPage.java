package TanyaTest.Pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotlineSingInPage extends BasePage {
    public HotlineSingInPage(WebDriver driver) {
        super(driver);
    }

    public void navigateHotline() {

        driver.get("https://hotline.ua/");
    }

    public WebElement user() {
        return waitElementToBeClickable("//div[@class='user-button__image flex middle-xs center-xs']");
    }

    public WebElement email() {
       return waitElementToBeClickable("//input[@class='field m_b-sm']");
    }
    public WebElement password() {
       return waitElementToBeClickable("//input[@class='field']");
    }
    public WebElement singinBtn() {
       return waitElementToBeClickable("//input[@class='btn-graphite btn-cell']");
    }
}

