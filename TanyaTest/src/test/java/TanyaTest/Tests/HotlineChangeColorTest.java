package TanyaTest.Tests;

import FrameworkClasses.TestInit;
import TanyaTest.Pages.HotlineHeaderViewElements;
import TanyaTest.Pages.HotlineHeaderViewHelper;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineChangeColorTest extends TestInit {
    @Test
    public void testColorChanged() {
        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);
        hotlineHeaderViewElements.navigateHotline();
        hotlineHeaderViewHelper.closePopUp();

        for (WebElement element : hotlineHeaderViewElements.rightSideHeaderButtons()) {
            hotlineHeaderViewHelper.moveCursor(element);
            Assert.assertNotEquals(hotlineHeaderViewHelper.getColorBefore(element), hotlineHeaderViewHelper.getColorAfter(element));
        }
    }
}
