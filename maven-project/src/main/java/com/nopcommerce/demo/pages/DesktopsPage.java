package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class DesktopsPage extends Util {

    By desktopTextOnDesktopPage = By.xpath("//h1[contains(text(),'Desktops')]");
    By addToCartBtn = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]");
    By productBuildText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By addCartMessage = By.xpath("//p[@class='content']");
    By hddOptionBtn = By.id("product_attribute_3_6");
    String zToA = "Name: Z to A";
    By sortByDropDown = By.id("products-orderby");

    public String buildYourOwnComputerText() {
        return getTextFromElement(productBuildText);
    }

    public String getDesktopText() {
        return getTextFromElement(desktopTextOnDesktopPage);
    }

    public String productIsaddedToCartMessage() {
        return getTextFromElement(addCartMessage);
    }

    public void clickOnAddToCartBtn() {
        clickOnElement(addToCartBtn);
    }

    public void clickOnHddRedioBtn() {
        clickOnElement(hddOptionBtn);
    }

}

