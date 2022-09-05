package AttemptPower.TestChain;

import AttemptPower.PageForTest.rozetkaHome;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class rozetkaTest1 extends TestInit {

    @Test
    public void openRozetka(){
        rozetkaHome rozetkaHomePage = new rozetkaHome(driver);
        rozetkaHomePage.goToRozetka();
        rozetkaHomePage.findHeadphone();
        sleep(1);
        rozetkaHomePage.clickHeadphonesCategory();
        sleep(1);
        rozetkaHomePage.clickSellerRozetka();
        sleep(1);
        rozetkaHomePage.clickMakerSades();
        sleep(1);
        rozetkaHomePage.clickNameSadesSa();
        sleep(1);
        rozetkaHomePage.clickCharacteristicsSa();
        sleep(1);
        rozetkaHomePage.assertType();
    }
}
