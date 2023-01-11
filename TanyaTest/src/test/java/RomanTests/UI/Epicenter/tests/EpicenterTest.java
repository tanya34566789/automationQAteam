package RomanTests.UI.Epicenter.tests;

import RomanTests.UI.Epicenter.pages.*;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

    public void login() {
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        homePage.headerLoginContainer().click();
        logInPage.inputLoginField().sendKeys("0671607348");
        logInPage.inputPasswordField().sendKeys("Samsung1127_");
        logInPage.submitButton().click();
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

    @Test
    public void likeAllResults() {
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = new LogInPage(driver);
        homePage.goEpicenterHomePage();
        login();
        sleep(3);
        homePage.headerSearchField().sendKeys("electronics\n");
        ResultSearchElectronicsPage resultSearchPage = new ResultSearchElectronicsPage(driver);
        sleep(2);
        for (WebElement like : resultSearchPage.likeList()) {
            like.click();
        }
    }

    @Test
    public void delAllWish() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        login();
        LikePage likePage = new LikePage(driver);
        homePage.headerWhishesIcon().click();
        sleep(1);

        if (likePage.emptyWish().isDisplayed()) {
            System.out.println("wish list is empty");
        } else {
            sleep(1);
            for (WebElement delBtn : likePage.delWiwhs()) {
                delBtn.click();
                sleep(1);
            }
        }

    }

    @Test
    public void compareTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        homePage.headerSearchField().sendKeys("toy\n");
        ResultSearchElectronicsPage resultSearchPage = new ResultSearchElectronicsPage(driver);
        for (int i = 0; i < 2; i++) {
            resultSearchPage.compareBtn().click();
            sleep(1);
        }
        homePage.headerCompapareIcon().click();
        ComparePage comparePage = new ComparePage(driver);
        Assert.assertTrue(comparePage.compareBtn().isDisplayed());
        comparePage.compareBtn().click();
        sleep(2);
        Assert.assertTrue(comparePage.compareContainer().isDisplayed());

    }


    @Test
    public void checkScheduleOfHolidays() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        Assert.assertTrue(homePage.scheduleOfHolidaysBtn().isDisplayed());
        homePage.scheduleOfHolidaysBtn().click();
        ScheduleOfHolidaysPage scheduleOfHolidaysPage = new ScheduleOfHolidaysPage(driver);
        Assert.assertTrue(scheduleOfHolidaysPage.showOnlyEpicenterShopBtn().isDisplayed());
        scheduleOfHolidaysPage.showOnlyEpicenterShopBtn().click();
        for (WebElement EpicenterShop : scheduleOfHolidaysPage.allEpicentersOfUkraine()) {
            for (WebElement EpicenterAdress : scheduleOfHolidaysPage.allAddressesOfEpicenters()) {
                Assert.assertTrue(EpicenterAdress.isDisplayed());
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");
    }

    @Test
    public void checkHomePageClickCatalog() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        Assert.assertTrue(homePage.headerСatalogGoods().isDisplayed());
        homePage.headerСatalogGoods().click();
        Actions actions = new Actions(driver);
        for (WebElement hedaerCatalogItem : homePage.headerCatalogItems()) {
            actions.moveToElement(hedaerCatalogItem).perform();
            sleep(1);
        }
        Assert.assertTrue(homePage.saleCatalogItem().isDisplayed());
        homePage.saleCatalogItem().click();
    }

    @Test
    public void actualSaleCapacity() {
        SalePage salePage = new SalePage(driver);
        salePage.goSalePage();

        Assert.assertTrue(salePage.actualBtn().isDisplayed());
        Assert.assertTrue(salePage.archiveBtn().isDisplayed());

        salePage.actualBtn().click();

        for (WebElement actualItem : salePage.actualItems()) {
            Assert.assertTrue(actualItem.isDisplayed());
        }

        salePage.archiveBtn().click();

        for (WebElement actualItem : salePage.actualItems()) {
            Assert.assertTrue(actualItem.isDisplayed());
        }
    }

    @Test
    public void buyAndDel() {
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();
        homePage.headerSearchField().sendKeys("electronics\n");
        ResultSearchElectronicsPage resultSearchElectronicsPage = new ResultSearchElectronicsPage(driver);

        resultSearchElectronicsPage.cards().get(1).click();

        FreezerPage freezerPage = new FreezerPage(driver);

        freezerPage.buyBtn().click();

        BasketPage basketPage = new BasketPage(driver);

        int purshNum = 4;

        String startPrice = basketPage.totalSumOfPurchase().getText();

        for (int i = 1; i < purshNum; i++) {
            basketPage.addBtn().click();
            sleep(3);
            System.out.println(basketPage.numberOfBuyInput().getAttribute("value"));
        }
        sleep(4);

        for (int i = 1; i < purshNum; i++) {
            basketPage.decreaseBtn().click();
            sleep(3);
            System.out.println(basketPage.numberOfBuyInput().getAttribute("value"));
        }

        Assert.assertEquals(startPrice, basketPage.totalSumOfPurchase().getText());
    }

    //filed test to redo
    @Test
    public void deleteAllGoodsFromBasket(){
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();

        homePage.headerSearchField().sendKeys("electronics\n");

        ResultSearchElectronicsPage resultSearchElectronicsPage = new ResultSearchElectronicsPage(driver);

        Actions actions = new Actions(driver);

        BasketPage basketPage = new BasketPage(driver);

        for (WebElement card: resultSearchElectronicsPage.cards()) {
            for (WebElement byBtn: resultSearchElectronicsPage.byBtnsYellow()) {
                actions.moveToElement(byBtn).click();
                sleep(1);
                basketPage.continuePursh().click();
                sleep(1);
            }
        }

    }

    @Test
    public void sliderHomePageTest(){
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();

        Assert.assertTrue(homePage.mainAdvertisingSlider().isDisplayed());

        for (int i = 0; i < 5; i++) {
            homePage.sliderNextBtn().click();
            sleep(1);
        }
        for (int i = 0; i < 5; i++) {
            homePage.sliderPreviousBtn().click();
            sleep(1);
        }

        Assert.assertTrue(homePage.mainAdvertisingSlider().isDisplayed());
    }

    @Test
    public void checkPrimitiveFilterByCompass(){
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();

        homePage.compassLink().click();

        CompassPage compassPage = new CompassPage(driver);

        for (WebElement filterBtn: compassPage.allFiltersBtns()) {
            filterBtn.click();
            sleep(4);
            for (WebElement cardBox: compassPage.cardBoxes()) {
                Assert.assertTrue(cardBox.isDisplayed());
            }
        }

        Assert.assertTrue(compassPage.filterHidden().isDisplayed());

        String filterClasses = compassPage.filterWrapper().getAttribute("class");


        // don't know how to do
//        for (String filterClas: filterClasses.split(" ")) {
//                if(filterClas.equals("non-active")){
//                    compassPage.filterHidden().click();
//                    System.out.println("click");
//                }else {
//                    Assert.assertTrue(filterClas.equals("non-active"));
//                    System.out.println("not click");
//                }
//        }

    }


    @Test
    public void filtersParamsTest(){
        HomePage homePage = new HomePage(driver);
        homePage.goEpicenterHomePage();

        homePage.compassLink().click();

        CompassPage compassPage = new CompassPage(driver);
        compassPage.minPriceInput().clear();
        compassPage.minPriceInput().sendKeys("1\n");
        sleep(2);
//        Assert.assertEquals(compassPage.minPriceInput().getAttribute("value"), "39");

        compassPage.maxPriceInput().clear();
        compassPage.maxPriceInput().sendKeys("20000\n");

        sleep(2);
//        Assert.assertEquals(compassPage.maxPriceInput().getAttribute("value"), "2872");

        Assert.assertTrue(compassPage.cardBoxes().size() > 5);
        sleep(3);

        compassPage.checkBoxEpicenter().click();

        CompasPageHelper compasPageHelper = new CompasPageHelper(driver);

        compasPageHelper.checkIsDisplayedCardBoxes();

        compassPage.checkBoxOther().click();

        compasPageHelper.checkIsDisplayedCardBoxes();

        sleep(2);
        compassPage.checkBoxAceCamp().click();
        sleep(2);
        compassPage.checkBoxAceMFH().click();

        compasPageHelper.checkIsDisplayedCardBoxes();

        compassPage.checkBoxLiquidless().click();

        Assert.assertTrue(compassPage.clearAllFilterBtn().isDisplayed());
        sleep(3);
        compassPage.clearAllFilterBtn().click();
        sleep(3);
        Assert.assertTrue(compassPage.cardBoxes().size() > 5);

        //how to do test without sleep method ?
    }





}



