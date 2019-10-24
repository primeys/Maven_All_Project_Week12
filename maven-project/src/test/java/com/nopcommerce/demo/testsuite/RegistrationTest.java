package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedText = "Your Personal Details";
        Assert.assertEquals(registrationPage.registerText(), expectedText);
    }

    @Test
    public void userShouldRegisterSuccessFully() {
        homePage.selectCurrencyByName("Euro");
        homePage.clickOnRegisterLink();
        registrationPage.clickOnGender(loadProperty.getProperty("gender"));
        registrationPage.enterFirstName(loadProperty.getProperty("firstName"));
        registrationPage.enterLastName(loadProperty.getProperty("lastName"));
        registrationPage.enterDayOfBirth(loadProperty.getProperty("day"));
        registrationPage.enterMonthOfBirth(loadProperty.getProperty("month"));
        registrationPage.enterYearOfBirth(loadProperty.getProperty("year"));
        registrationPage.enterEmailAddress(loadProperty.getProperty("email"));
        registrationPage.enterCompanyName(loadProperty.getProperty("companyName"));
        registrationPage.enterPassword(loadProperty.getProperty("password"));
        registrationPage.enterConfirmPassword(loadProperty.getProperty("confirmPassword"));
        registrationPage.clickOnRegistrationBtn();
    }


}
