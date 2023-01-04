package TestSerhio.Tickets.Page;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AircrafATRAirNewZelandPage extends BasePage {


    public AircrafATRAirNewZelandPage(WebDriver driver) {
        super(driver);
    }
    public void goToTickets() {
        driver.get("https://tickets.ua/en");
    }
    public WebElement buttonAllAirlines() {
        return findElementByXpath("//a[@href=\"https://avia.tickets.ua/en/airline\"]");
    }
    public WebElement fieldSearchAirlines() {
        return findElementByXpath("//input [@class=\"form-input\"]");
    }
    public WebElement fieldSearchResultAirlines() {
        return findElementByXpath("//div[@class=\"row airports js-airports\"]//span[@data-code='NZ']");
    }
    public WebElement infoAboutAirNewZeland() {
        return findElementByXpath("//a[@id=\"avia_rating_show_tab_details\"]");
    }
    public WebElement AircraftATR() {
        return findElementByXpath("//a[contains (text(), 'ATR-72-500')]");
    }
}
