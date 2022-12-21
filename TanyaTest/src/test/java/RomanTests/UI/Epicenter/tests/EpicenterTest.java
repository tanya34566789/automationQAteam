package RomanTests.UI.Epicenter.tests;

import RomanTests.UI.Epicenter.pages.HomePage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EpicenterTest extends TestInit {

    @Test
    public void checkHomePageElements(){

        HomePage homePage = new HomePage(driver);
        setUp();
        homePage.goEpicenterHomePage();

        //Check if the home page HEADER elements are present
        sleep(2);
        Assert.assertTrue(homePage.headerLogoImg().isDisplayed());
        Assert.assertTrue(homePage.headerLocationsDiv().isDisplayed());
        Assert.assertTrue(homePage.headerInfoDiv().isDisplayed());
        Assert.assertTrue(homePage.headerProfitLink().isDisplayed());
        Assert.assertTrue(homePage.headerСatalogOfGoods().isDisplayed());
        Assert.assertTrue(homePage.headerSearchField().isDisplayed());
        Assert.assertTrue(homePage.headerCompapareIcon().isDisplayed());
        Assert.assertTrue(homePage.headerWhishesIcon().isDisplayed());
        Assert.assertTrue(homePage.headerCartIcon().isDisplayed());
        Assert.assertTrue(homePage.headerLoginContainer().isDisplayed());

        //Check if the home page MAIN elements are present
        Assert.assertTrue(homePage.mainAdvertisingSlider().isDisplayed());
        Assert.assertTrue(homePage.mainProductOfTheDayContainer().isDisplayed());
        Assert.assertTrue(homePage.mainPopularCategoryContainer().isDisplayed());
        Assert.assertTrue(homePage.mainOverviewCategoriesContainer().isDisplayed());
        Assert.assertTrue(homePage.mainPartnersSliderContainer().isDisplayed());
        Assert.assertTrue(homePage.mainStoreDescriptionContainer().isDisplayed());

        //Check if the home page FOOTER elements are present
        Assert.assertTrue(homePage.footerSocialNetworksContainer().isDisplayed());
        Assert.assertTrue(homePage.footerInfoContainer().isDisplayed());
        Assert.assertTrue(homePage.footerCopywritingContainer().isDisplayed());
        int i = 0;
        quit();
    }

    @Test
    public void miniTest(){
        setUp();
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();

    }



}
