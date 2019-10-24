package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class LoginPage extends Util {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText =By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public void enterEmail(String email){
        sendTextToElement(emailField,email);}

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);}

    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);}

    public  String welcomeText(){return getTextFromElement(welcomeText);
    }

}
