package com.orange.demo.homepage;

import com.orange.demo.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By userNameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");


    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
        //sendTextToElement(userNameField,userName);
    }

    public void enterPassword (String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginBtn (){
        clickOnElement(loginBtn);
    }
 }




