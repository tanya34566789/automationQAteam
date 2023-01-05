package TestSerhio.Tickets.Page;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AviaDatelessPage extends BasePage {
    public AviaDatelessPage(WebDriver driver) {
        super(driver);}
    public  void goToTickets(){
        driver.get("https://tickets.ua/en");
        }
        public WebElement aviaFrom(){
        return findElementByXpath("//div[contains (text(), 'From')]");
        }
        public WebElement fieldFrom(){
        return findElementByXpath("//div[contains (@class, 'input departure')]//input[@type=\"text\"]");
        }
        public WebElement aviaTo() {
            return findElementByXpath("//div[contains (text(), 'To')]");
        }
        public WebElement fieldTo(){
            return findElementByXpath("//div [contains(@class,'arrival')]//input[@type=\"text\"]");
            }
        public WebElement clickWarsaw(){
        return findElementByXpath("//li[@class=\"bg-1 t-select__item\"]//div [contains (text(), 'WAW')]");
        }
        public WebElement clickParis(){
        return findElementByXpath("//div[@class=\"double-autocomplete__item ltr\"]//div [contains (text(), 'PAR')]");
        }
        public WebElement buttonSearch(){
        return findElementByXpath("//button[contains (text(), 'Search')]");
        }
        public WebElement errorMessage(){
        return findElementByXpath("//div[@class=\"t-date-picker__error-message inside\"]");
        }
    }

