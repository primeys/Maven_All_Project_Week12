package com.newlook.pages;

import com.newlook.utilty.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By womensLink = By.xpath("//body[@id='body']/main[@class='main']/header[@class='masthead ng-isolate-scope masthead--top']/div[@class='masthead__secondary ng-scope']/div[@class='masthead__main-wrapper']/div[@class='masthead__main-wrapper-table']/div[@id='skiptonavigation']/div[@class='main-navigation__wrapper']/nav[@class='main-navigation direction-forward']/ol[@class='main-navigation__primary-menu primary menu-is-open']/div[@class='main-navigation__primary-menu--top-content']/li[1]/a[1]");
    By mensLink = By.xpath("//body[@id='body']/main[@class='main']/header[@class='masthead ng-isolate-scope masthead--top']/div[@class='masthead__secondary ng-scope']/div[@class='masthead__main-wrapper']/div[@class='masthead__main-wrapper-table']/div[@id='skiptonavigation']/div[@class='main-navigation__wrapper']/nav[@class='main-navigation direction-forward']/ol[@class='main-navigation__primary-menu primary']/div[@class='main-navigation__primary-menu--top-content']/li[2]/a[1]");

        public void clickOnWomensLink(){
            clickOnElement(womensLink);
        }

        public void clickOnMensLink(){
            clickOnElement(mensLink);
        }



}
