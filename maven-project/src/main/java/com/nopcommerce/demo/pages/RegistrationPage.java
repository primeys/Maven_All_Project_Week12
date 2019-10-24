package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class RegistrationPage extends Util {
    By genderFieldMale = By.id("gender-male");
    By getGenderFieldFemale = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dayOfBirthField = By.name("DateOfBirthDay");
    By monthOfBirthField = By.name("DateOfBirthMonth");
    By yearOfBirthYear = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By newsLetterTick = By.id("Newsletter");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registerPageText = By.xpath("//strong[contains(text(),'Your Personal Details')]");

    public void clickOnGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            clickOnElement(genderFieldMale);
        } else if (gender.equalsIgnoreCase("female")) {
            clickOnElement(getGenderFieldFemale);
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterDayOfBirth(String birthDay) {
        sendTextToElement(dayOfBirthField, birthDay);
    }

    public void enterMonthOfBirth(String birthMonth) {
        sendTextToElement(monthOfBirthField, birthMonth);
    }

    public void enterYearOfBirth(String birthYear) {
        sendTextToElement(yearOfBirthYear, birthYear);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterCompanyName(String companyName) {
        sendTextToElement(companyNameField, companyName);
    }

    public void newsLetter() {
        clickOnElement(newsLetterTick);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegistrationBtn() {
        clickOnElement(registerBtn);
    }

    public String registerText (){
        return getTextFromElement(registerPageText);}
}
