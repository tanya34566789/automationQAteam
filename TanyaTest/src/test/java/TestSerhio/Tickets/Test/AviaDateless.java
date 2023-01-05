package TestSerhio.Tickets.Test;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestSerhio.Tickets.Page.AviaDatelessPage;
import TestSerhio.Veliki.Page.BergamontDiscontPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AviaDateless extends TestInit {
    @Test
    public void aviaDateless (){
        AviaDatelessPage dataLess=new AviaDatelessPage(driver);
        driver.manage().window().maximize();
        dataLess.goToTickets();
        dataLess.aviaFrom().click();
        dataLess.fieldFrom().clear();
        dataLess.fieldFrom().sendKeys("Warsaw");
        dataLess.clickWarsaw().click();
        dataLess.aviaTo().click();
        dataLess.fieldTo().clear();
        dataLess.fieldTo().sendKeys("Paris");
        dataLess.clickParis().click();
        dataLess.buttonSearch().click();
        Assert.assertTrue(dataLess.errorMessage().isDisplayed());


    }
}
