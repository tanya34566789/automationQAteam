package RomanTests.UI.Epicenter.tests;

import RomanTests.UI.Epicenter.pages.*;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EpicenterTest extends TestInit {

    @Test
    public void checkHomePageElements() {

        HomePage homePage = new HomePage(driver);
        setUp();
        homePage.goEpicenterHomePage();

        //Check if the home page HEADER elements are present
        Assert.assertTrue(homePage.headerLogo().isDisplayed());
        Assert.assertTrue(homePage.headerLocationsDiv().isDisplayed());
        Assert.assertTrue(homePage.headerInfoDiv().isDisplayed());
        Assert.assertTrue(homePage.headerProfitLink().isDisplayed());
        Assert.assertTrue(homePage.headerСatalogGoods().isDisplayed());
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
    }


    @Test
    public void testSelectCity() {
        HomePage homePage = new HomePage(driver);
        SelectСityPage selectСityPage = new SelectСityPage(driver);
        setUp();
        homePage.goEpicenterHomePage();
        if (homePage.headerMiniModalButtonYes().isDisplayed()) {
            homePage.headerMiniModalButtonYes().click();
        }
        homePage.headerLocationsDiv().click();
        selectСityPage.searchFieldСity().sendKeys("Бровари");
        sleep(1);

        Assert.assertTrue(selectСityPage.getBrovaryCity().isDisplayed());
        selectСityPage.getBrovaryCity().click();
        selectСityPage.brovaryCityResultSearch().click();
    }


    @Test
    public void testLogIn() {
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        setUp();
        homePage.goEpicenterHomePage();
        homePage.headerLoginContainer().click();
        logInPage.inputLoginField().sendKeys("0671607348");
        logInPage.inputPasswordField().sendKeys("Samsung1127_");
        logInPage.submitButton().click();
    }


    @Test
    public void purshTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        homePage.headerSearchField().sendKeys("electronics\n");
        ResultSearchElectronicsPage resultSearchElectronicsPage = new ResultSearchElectronicsPage(driver);
        resultSearchElectronicsPage.freezerKS1100F().click();
        FreezerPageHelper freezerPageHelper = new FreezerPageHelper(driver);
        FreezerPage freezerPage = new FreezerPage(driver);
        freezerPageHelper.checkPrice();
        freezerPage.buyBtn().click();
        BasketPage basketPage = new BasketPage(driver);
        basketPage.numberOfBuyInput().clear();
        basketPage.numberOfBuyInput().sendKeys("3\n");
        sleep(3);
        System.out.println(basketPage.totalSumOfPurchase().getText());
        Assert.assertEquals(basketPage.totalSumOfPurchase().getText(), "17 997 ₴");
        basketPage.purchaseBtn().click();

    }


    @Test
    public void mouseMove() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        Actions builder = new Actions(driver);
        Action moveAction = builder
                .scrollToElement(homePage.footerInfoContainer())
                .scrollToElement(homePage.headerLogo())
                .moveToElement(homePage.footerInfoContainer())
                .keyDown(homePage.headerSearchField(), Keys.SHIFT)
                .sendKeys(homePage.headerSearchField(), "ababagalamagama\n")
                .keyUp(homePage.headerSearchField(), Keys.SHIFT)
                .build();
        sleep(4);
    }




}



