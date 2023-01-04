package TestSerhio.Tickets.Test;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestSerhio.Tickets.Page.PositivReRegistrationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositivReRegistrationTest extends TestInit {
    @Test
    public void PositivReRegistration() {
        PositivReRegistrationPage positivReRegist = new PositivReRegistrationPage(driver);
        driver.manage().window().maximize();
        positivReRegist.goToTickets();
        positivReRegist.ButtonMyAccount().click();
        positivReRegist.SectionRegistratin().click();
        positivReRegist.EnterValidValue();
        positivReRegist.iconIAccept().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        positivReRegist.ButtonRegistratin().click();
        Assert.assertTrue(positivReRegist.Error().isDisplayed());
        }


}
