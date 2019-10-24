package com.orange.demo.testsuite;

import com.orange.demo.basetest.BaseTest;
import com.orange.demo.homepage.HomePage;
import com.orange.demo.loadproperty.LoadProperty;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldLoginSuccessfully(){

        homePage.enterUserName(loadProperty.getProperty("userName"));
        homePage.enterPassword(loadProperty.getProperty("password"));
        homePage.clickOnLoginBtn();
    }



}
