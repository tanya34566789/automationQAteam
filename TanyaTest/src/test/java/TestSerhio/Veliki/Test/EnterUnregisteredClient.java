package TestSerhio.Veliki.Test;

import TanyaTestFoxtrot.pageObjects.TestInit;
import TestSerhio.Veliki.Page.EnterUnregisteredClientPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnterUnregisteredClient extends TestInit {
    @Test
    public void EnterUnregisteredClient() {
        EnterUnregisteredClientPage unregClient = new EnterUnregisteredClientPage(driver);
        driver.manage().window().maximize();
        unregClient.goToVeliki();
        unregClient.velikiUa().click();
        unregClient.validLogPass();
        unregClient.buttonEnterRegistration().click();
        Assert.assertTrue(unregClient.btnINewBuyer().isDisplayed());
    }
}
