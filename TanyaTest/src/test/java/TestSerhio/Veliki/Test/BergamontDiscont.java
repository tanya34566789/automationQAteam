package TestSerhio.Veliki.Test;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestSerhio.Veliki.Page.BergamontDiscontPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BergamontDiscont extends TestInit {
    @Test
    public void bergamontDiscont() {
        BergamontDiscontPage discont = new BergamontDiscontPage (driver);
        driver.manage().window().maximize();
        discont.goToVeliki();
        discont.velikiUa().click();
        discont.getSearchFildVeliki().click();
        discont.getSearchInput().sendKeys("bergamont\n");
        discont.getDiscountBike().click();
        Assert.assertTrue(discont.delPrice().isDisplayed());
    }
}




