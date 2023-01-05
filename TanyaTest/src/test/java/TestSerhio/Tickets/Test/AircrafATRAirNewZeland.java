package TestSerhio.Tickets.Test;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestSerhio.Tickets.Page.AircrafATRAirNewZelandPage;
import TestSerhio.Tickets.Page.AviaDatelessPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AircrafATRAirNewZeland extends TestInit {
    @Test
    public void AircrafATRAirNewZeland() {
        AircrafATRAirNewZelandPage aircrafATR = new AircrafATRAirNewZelandPage(driver);
        driver.manage().window().maximize();
        aircrafATR.goToTickets();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        aircrafATR.buttonAllAirlines().click();
        aircrafATR.fieldSearchAirlines().sendKeys("air new \n");
        aircrafATR.fieldSearchResultAirlines().click();
        aircrafATR.infoAboutAirNewZeland().click();
        Assert.assertTrue(aircrafATR.AircraftATR().isDisplayed());
        }
}
