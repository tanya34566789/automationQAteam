package RomanTests.UI.Epicenter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExercPage extends BasketPage {
    public ExercPage(WebDriver driver) {
        super(driver);
    }

    public Select select = new Select(driver.findElement(By.xpath("//select[contains(@class, 'Select_select__y1CZ9')]")));

    public WebElement button(){
        return findElementByXpath("//button[contains(@class, 'Button_btn__sIYYr')]");
    }

    public void goExercisePage(){
        driver.get("https://automation-test-starnavi.netlify.app/");
    }
}
