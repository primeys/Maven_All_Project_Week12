package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By customerCurrency = By.id("customerCurrency");
    By wishList = By.className("wishlist-label");
    By shoppingCart = By.name("Shopping cart");
    By computers = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronics = By.name("Electronics ");
    By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitalDownloads = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By books = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftCards = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void selectCurrencyByName(String currency) {
        selectByVisibleTextFromDropDown(customerCurrency, currency);
    }

    public void clickOnWishList() {
        clickOnElement(wishList);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }


    public void clickOnComputers() {
        clickOnElement(computers);
    }

    public void clickOnElectronics() {
        clickOnElement(electronics);
    }

    public void clickOnApparel() {
        clickOnElement(apparel);
    }

    public void clickOnDigitalDownloads() {
        clickOnElement(digitalDownloads);
    }

    public void clickOnBooks() {
        clickOnElement(books);
    }

    public void clickOnJewelry() {
        clickOnElement(jewelry);
    }

    public void clickOnGiftCards() {
        clickOnElement(giftCards);
    }


}