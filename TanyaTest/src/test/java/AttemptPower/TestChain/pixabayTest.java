package AttemptPower.TestChain;

import AttemptPower.PageForTest.pixabayHome;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class pixabayTest extends TestInit {

    @Test
    public void openPixabay(){
        pixabayHome goPixabayHome= new pixabayHome(driver);
        goPixabayHome.goToPixabay();
        goPixabayHome.findSearchPixabay();
        goPixabayHome.clickOneOf();
        goPixabayHome.chooseOneOfTrending();
        goPixabayHome.clickTypeOf();
        goPixabayHome.chooseTypeOfPhone();
        goPixabayHome.clickOrientationOf();
        goPixabayHome.chooseOrientationOfHorizontal();
        goPixabayHome.clickSizeOf();
        goPixabayHome.writeSizeOfWidth();
        goPixabayHome.writeSizeOfHeight();
        goPixabayHome.clickSizeOfGo();
        goPixabayHome.chooseOfColor();
        goPixabayHome.clickBlueButton();
        goPixabayHome.clickYellowButton();
        goPixabayHome.clickOfColorGo();
        goPixabayHome.chooseOfDate();
        goPixabayHome.clickOfDateDays();
        goPixabayHome.clickButtonClearFilters();
        goPixabayHome.clickSearchButton();
        goPixabayHome.writeSearchPixabayTwo();
        goPixabayHome.watchWhiteCat();
        goPixabayHome.testCat();
        sleep(1);
    }
}
