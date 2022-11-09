package TanyaTest.Tests;

import TanyaTest.Pages.HotlineHomePageBtn;
import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestHotlineBtn extends TestInit {
    @Test
    public void cheackBTNPopularGoods() {
        HotlineHomePageBtn hotlineHomePageBtn = new HotlineHomePageBtn(driver);
        hotlineHomePageBtn.navigateHotline();
        hotlineHomePageBtn.scroll(300);
        for (int i = 0; i < hotlineHomePageBtn.popularOptions().size(); i++) {
            hotlineHomePageBtn.popularOptions().get(i).click();
        }
    }

    @Test
    public void cheackBTNActualNow() {
        HotlineHomePageBtn hotlineHomePageBtn = new HotlineHomePageBtn(driver);
        hotlineHomePageBtn.navigateHotline();
        hotlineHomePageBtn.scroll(1000);
        for (int i = 0; i < hotlineHomePageBtn.actualNow().size(); i++) {
            hotlineHomePageBtn.actualNow().get(i).click();
        }
    }
}
