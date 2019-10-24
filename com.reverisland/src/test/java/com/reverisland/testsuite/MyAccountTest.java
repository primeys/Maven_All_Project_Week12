package com.reverisland.testsuite;

import com.reverisland.basetest.BaseTest;
import com.reverisland.pages.HomePage;
import com.reverisland.pages.MyAccountPage;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {

    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test

    public void userShouldNavigateToMyAccountPageSuccessfully(){

       homePage.clickOnMyAccountLink();


    }



}
