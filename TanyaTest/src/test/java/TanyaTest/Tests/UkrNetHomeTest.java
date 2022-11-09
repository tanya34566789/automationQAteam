package TanyaTest.Tests;

import TanyaTest.Pages.UkrNetHomePage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UkrNetHomeTest extends TestInit {
    @Test
    public void checkButtonHome() {
        UkrNetHomePage ukrNetHomePage = new UkrNetHomePage(driver);
        ukrNetHomePage.navigateUkrNet();
        for (int i = 0; i < ukrNetHomePage.rightTabs().size(); i++)
            Assert.assertTrue(ukrNetHomePage.rightTabs().get(i).isDisplayed());
    }

    @Test
    public void checkSerchField(){
        UkrNetHomePage ukrNetHomePage = new UkrNetHomePage(driver);
        ukrNetHomePage.navigateUkrNet();
         Assert.assertTrue(ukrNetHomePage.searchField().isDisplayed());
    }
}
