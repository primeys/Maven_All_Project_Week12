package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ItemPage extends Util {
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public void clickOnAddToCart(){
        clickOnElement(buildYourOwnText);
    }
}
