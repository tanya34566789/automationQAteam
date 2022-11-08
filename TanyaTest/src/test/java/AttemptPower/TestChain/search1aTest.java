package AttemptPower.TestChain;

import AttemptPower.PageForTest.search1aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class search1aTest extends TestInit {
    @Test
    public void search1aEpicentr() {
        search1aPage search1a = new search1aPage(driver);
        search1a.goToEpicentr();
        search1a.findOfficeFurniture();
        search1a.clickOfficeChairs();
    }
}
