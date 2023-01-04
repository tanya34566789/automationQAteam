package RomanTests.UI.Epicenter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ScheduleOfHolidaysPage extends BasketPage {
    public ScheduleOfHolidaysPage(WebDriver driver) {
        super(driver);
    }

    public WebElement scheduleOfHolidaysLink(){
        return findElementByXpath("//div[contains(@class, '_IS80rA')]/a");
    }

    public WebElement showOnlyEpicenterShopBtn(){
        return findElementByXpath("//input[contains(@value, '1')]/ancestor::div[contains(@class, '_iCLqaq')]");
    }

    public List<WebElement> allEpicentersOfUkraine(){
        return findElementsByXpath("//div[contains(@class, '_prDLi_')]");
    }

    public List<WebElement> allAddressesOfEpicenters(){
        return findElementsByXpath("//div[contains(@class, '_dwvh4d')]/div/a");
    }
}
