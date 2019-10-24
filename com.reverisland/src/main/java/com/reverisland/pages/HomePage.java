package com.reverisland.pages;

import com.reverisland.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By myAccountLink = By.id("header-my-account");

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }








}
