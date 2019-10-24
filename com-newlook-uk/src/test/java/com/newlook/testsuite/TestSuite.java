package com.newlook.testsuite;

import com.newlook.basetest.BaseTest;
import com.newlook.pages.HomePage;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
HomePage homePage = new HomePage();

@Test
    public void UserShouldOnHomePage(){

    homePage.clickOnWomensLink();
    homePage.clickOnMensLink();
}




}
