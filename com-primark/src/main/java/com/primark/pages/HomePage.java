package com.primark.pages;

import com.primark.util.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By menLink = By.xpath("//li[@class='mega-nav__item js-mega-nav__item mega-nav__item--parent js-mega-nav-parent mega-nav__item--show-panel']//a[contains(text(),'Men')]");
    By homeWareLink = By.xpath("//li[@class='mega-nav__item js-mega-nav__item mega-nav__item--parent js-mega-nav-parent mega-nav__item--show-panel']//a[contains(text(),'Homeware')]");


    public void clickOnMenLink(){
        clickOnElement(menLink);


    } public void clickOnHomeWareLink(){
        clickOnElement(homeWareLink);
    }




}
