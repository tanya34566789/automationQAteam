package RomanTests.UI.Epicenter.pages;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VacanciesPage extends BasePage {
    public VacanciesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement formFilter(){
        return findElementByXpath("//div[contains(@class, '_abxscz')]/form");
    }

    public List<WebElement> vacationLinks(){
        return findElementsByXpath("//ul[contains(@class, '_fKK74M')]//a");
    }

    public WebElement citySelect(){
        return findElementByXpath("//input[contains(@name, 'city')]/parent::div");
    }

    public WebElement selectOnePosition(){
        return findElementByXpath("//div[contains(@class, '_RsDPc1')][2]");
    }

    public WebElement locationSelect(){
        return findElementByXpath("//input[contains(@name, 'market')]/parent::div");
    }

    public WebElement vacationSelect(){
        return findElementByXpath("//input[contains(@name, 'vacancy')]/parent::div");
    }

}
