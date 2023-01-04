package TestSerhio.Tickets.Page;

import TanyaTestFoxtrot.pageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PositivReRegistrationPage extends BasePage {

    String firstName = "Hirchenko";
    String lastName = "Serhiy";
    String password = "myTickets";
    String eMail = "girchenko1979@ukr.net";
    String phoneNumb = "673275272";

    public PositivReRegistrationPage(WebDriver driver) {
        super(driver);
    }
    public  void goToTickets(){
        driver.get("https://tickets.ua/en");
    }
    public WebElement ButtonMyAccount() {
        return findElementByXpath("//div[contains (text(), 'account')]");
    }
    public WebElement SectionRegistratin() {
        return findElementByXpath("//div[contains (text(), 'Registration')]");
    }
    public WebElement FieldFirstName() {
        return findElementByXpath("//input[@name=\"firstName\"]");
    }
    public WebElement FieldLastName() {
        return findElementByXpath("//input[@name=\"lastName\"]");
    }
    public WebElement FieldPassword(){
        return findElementByXpath("//input[@name=\"password\"]");
    }
    public WebElement FieldEmail(){
        return  findElementByXpath("//div[contains (@class, 't-email-input')]//input[@name=\"email\"]");
            }
    public WebElement FieldPhoneNum() {
        return findElementByXpath("//input[contains (@class, 't-phone-input')]");
    }
    public WebElement iconIAccept() {
        return findElementByXpath("//label[contains(@class,'element')]//div [@class=\"t-checkbox-v2__icon\"]");
    }
        public WebElement ButtonRegistratin() {
            return findElementByXpath("//div[@class=\"col-24\"]//button[@type=\"submit\"]");
        }
        public WebElement Error(){
        return findElementByXpath("//div[contains(text(), 'Please check')]");
        }

    public void EnterValidValue(){
        FieldFirstName().sendKeys(firstName);
        FieldLastName().sendKeys(lastName);
        FieldPassword().sendKeys(password);
        FieldEmail().sendKeys(eMail);
        FieldPhoneNum().sendKeys(phoneNumb);
    }


}
