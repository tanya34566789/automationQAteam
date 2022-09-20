package AttemptPower.TestChain;

import AttemptPower.PageForTest.information2aPage;
import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class information2aTest extends TestInit {
    @Test
    public void information2aEpicentr(){
        information2aPage information2a = new information2aPage(driver);
        information2a.goToEpicentr();
        information2a.goAllInformation();
    }
}
