package AttemptPower.TestChain;

import AttemptPower.PageForTest.leboutiqueHome;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class leboutiqueTest1 extends TestInit {

    @Test
    public void openLeboutique(){
        leboutiqueHome leboutiqueHomePage = new leboutiqueHome(driver);
        leboutiqueHomePage.goToLeboutique();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        leboutiqueHomePage.clickCategoryMen();
        leboutiqueHomePage.clickCategoryOuterwear();
        leboutiqueHomePage.clickCategoryRaincoat();
        sleep(1);
        leboutiqueHomePage.clickPriceButton();
        leboutiqueHomePage.clearPriceTo();
        leboutiqueHomePage.writePriceTo();
        sleep(1);
        leboutiqueHomePage.clearPriceFrom();
        sleep(1);
        leboutiqueHomePage.writePriceFrom();
        sleep(1);
        leboutiqueHomePage.clickSelectButton();
        sleep(1);
        leboutiqueHomePage.clickCloakImage();
        sleep(1);
        leboutiqueHomePage.clickCloakBasket();
        sleep(1);
        leboutiqueHomePage.clickSizeBeforeBasketCloak();
        sleep(1);
        leboutiqueHomePage.shoesSearchLeboutique();
        sleep(5);
        leboutiqueHomePage.clickSearchButtonLeboutique();
        sleep(5);
        leboutiqueHomePage.clickBlackShoes();
        sleep(1);
        leboutiqueHomePage.clickShoesBasket();
        sleep(1);
        leboutiqueHomePage.clickSizeBeforeBasketShoes();
        sleep(5);
        leboutiqueHomePage.clickBasket();
        sleep(1);
        leboutiqueHomePage.assertTwoGoods();
        sleep(3);
    }
}
