package AttemptPower.TestChain;

import AttemptPower.PageForTest.information3aPage;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

public class information3aTest extends TestInit {
    @Test
    public void information3aEpicentr() {
        information3aPage information3a = new information3aPage(driver);
        information3a.goToEpicentr();
        information3a.goQuestionsAnswers();
    }
}
