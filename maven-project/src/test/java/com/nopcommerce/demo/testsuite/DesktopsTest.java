package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void userShouldNavigateToDesktopPageSuccessfully() {

        homePage.clickOnComputers();
        String actualText = desktopsPage.getDesktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }
}
