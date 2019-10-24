package com.primark.testsuite;

import com.primark.basetest.BaseTest;
import com.primark.pages.HomePage;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();




    @Test
    public void userShouldNavigateToMenPage() {
        homePage.clickOnMenLink();

    }
    @Test
    public void userShouldNavigateToHomeWarePage(){
        homePage.clickOnHomeWareLink();
    }

}
