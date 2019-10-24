package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.ItemPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ItemTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ItemPage itemPage = new ItemPage();

    @Test
    public void userShouldNavigateToBuildYourOwnPageSuccessfully() {
        homePage.clickOnComputers();
        computersPage.clickOnDesktopImage();
        desktopsPage.clickOnAddToCartBtn();
        itemPage.clickOnAddToCart();
    }
}
