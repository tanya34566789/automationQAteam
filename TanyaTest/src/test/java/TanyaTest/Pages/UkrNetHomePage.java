package TanyaTest.Pages;

import FrameworkClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UkrNetHomePage extends BasePage {
    public UkrNetHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateUkrNet() {
        driver.get("https://www.ukr.net/");
    }

    public List<WebElement> rightTabs() {
        return waitVisibilityOfAllElementsLocatedBy("//ul[@class='right-tabs__nav d-clear']");
    }

    public WebElement searchField() {
        return waitElementToBeClickable("//input[@id='search-input']");
    }
}


