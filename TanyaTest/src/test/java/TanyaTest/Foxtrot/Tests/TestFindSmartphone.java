package TanyaTest.Foxtrot.Tests;

import FrameworkClasses.TestInit;
import org.testng.annotations.Test;

public class TestFindSmartphone extends TestInit {
    @Test
    public void searchSmartphone() {
        driver.get("https://www.foxtrot.com.ua");
    }
}
