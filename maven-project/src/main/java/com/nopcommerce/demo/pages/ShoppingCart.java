package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ShoppingCart extends Util {

    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By productVerifyText = By.xpath("//a[@class='product-name']");

    public void clickOnshoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }

    public String verifyShoppingWelcomeText(){
        return getTextFromElement(shoppingCartText);
    }
    public String verifyProductText(){

        return getTextFromElement(productVerifyText);
    }



}
