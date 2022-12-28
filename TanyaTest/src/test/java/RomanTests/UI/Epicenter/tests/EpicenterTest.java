package RomanTests.UI.Epicenter.tests;

import RomanTests.UI.Epicenter.pages.*;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EpicenterTest extends TestInit {

    @Test
    public void checkHomePageElements(){

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
        quit();
    }


    @Test
    public void testSelectCity(){
        HomePage homePage = new HomePage(driver);
        SelectСityPage selectСityPage = new SelectСityPage(driver);
        setUp();
        homePage.goEpicenterHomePage();
        if(homePage.headerMiniModalButtonYes().isDisplayed()){
            homePage.headerMiniModalButtonYes().click();
        }
        homePage.headerLocationsDiv().click();
        selectСityPage.searchFieldСity().sendKeys("Бровари");
        sleep(1);

        // питання
        // список результату пошуку завжди щось в собі містить(чому не пустий) навіть коли запит невірний
//        if(selectСityPage.resultsOfSearchCity().size() == 1){
//            System.out.println("English input is not supported,  the entered text is Ukrainian");
//        } if(selectСityPage.resultsOfSearchCity().size() > 1){
//            System.out.println("input in English is supported, you need to continue checking");
//            System.out.println(selectСityPage.resultsOfSearchCity().toString());
//            // add search by english text
//        }
//            selectСityPage.searchFieldСity().clear();
//            selectСityPage.searchFieldСity().sendKeys("otherCity\n");
        Assert.assertTrue(selectСityPage.getBrovaryCity().isDisplayed());
        selectСityPage.getBrovaryCity().click();
        selectСityPage.brovaryCityResultSearch().click();
        quit();
    }


    @Test
    public void testLogIn(){
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        setUp();
        homePage.goEpicenterHomePage();
        homePage.headerLoginContainer().click();
        logInPage.inputLoginField().sendKeys("0671607348");
        logInPage.inputPasswordField().sendKeys("Samsung1127_");
        logInPage.submitButton().click();
//        Assert.assertTrue(!logInPage.wrongPasswordOrLoginText().isDisplayed());
//        if(logInPage.wrongPasswordOrLoginText().isDisplayed()){
//            homePage.goEpicenterHomePage();
//            System.out.println("login failed, homepage is running");
//        }else {
//            System.out.println("login successful");
//        }
        quit();
        }


        @Test
        public void purshTest(){
//            setUp();
            HomePage homePage = new HomePage(driver);
            homePage.goEpicenterHomePage();
//            testLogIn(); не можна вставляти бо відкриває ще одне вікно
            homePage.headerSearchField().sendKeys("electronics\n");
            ResultSearchElectronicsPage resultSearchElectronicsPage = new ResultSearchElectronicsPage(driver);
//            Assert.assertTrue(resultSearchElectronicsPage.freezerKS1100F().isDisplayed());
            sleep(5);
//            Assert.assertTrue(resultSearchElectronicsPage.element().isDisplayed());
//            Assert.assertTrue(resultSearchElectronicsPage.termoreg().isDisplayed());
            resultSearchElectronicsPage.freezerKS1100F().click();
////            FreezerPage freezerPage = new FreezerPage(driver);
            FreezerPageHelper freezerPageHelper = new FreezerPageHelper(driver);
            FreezerPage freezerPage = new FreezerPage(driver);
            freezerPageHelper.checkPrice();
            freezerPage.buyBtn().click();
            BasketPage basketPage = new BasketPage(driver);
            basketPage.numberOfBuyInput().clear();
            basketPage.numberOfBuyInput().sendKeys("3");
            basketPage.decreaseBtn()
        }
    }

//    @Test
//    public void checkBurgerMenuHeaderСatalogOfGoods (){
//        HomePage homePage = new HomePage(driver);
//        setUp();
//        homePage.goEpicenterHomePage();
//        homePage.headerСatalogGoods().click();
//        Assert.assertTrue(homePage.headerСatalogGoodsMenu().isDisplayed());
//        if (homePage.headerСatalogGoodsMenu().isDisplayed()){
//            List<WebElement> allChildEl = homePage.headerСatalogGoodsMenu().findElements(By.xpath("*"));
//            System.out.println(allChildEl.toString());
//
//        //    homePage.headerСatalogGoods().click();
//        } else {
//            System.out.print("headerСatalogGoodsMenu notDisplayed");
//        }
//    }

//    @Test
//    public void getSearchGunResault(){
//        HomePage homePage = new HomePage(driver);
//        setUp();
//        homePage.goEpicenterHomePage();
//        homePage.headerSearchField().sendKeys("Gun\n");
//        ResultSearchGunPage resultSearchGunPage = new ResultSearchGunPage(driver);
//        sleep(2);
//        Assert.assertTrue(resultSearchGunPage.getElementsWithGunText().size() > 10);
//    }

