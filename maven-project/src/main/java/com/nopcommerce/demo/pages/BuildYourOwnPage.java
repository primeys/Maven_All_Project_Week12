package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class BuildYourOwnPage extends Util {
    String buildYourOwn = "build your own computer";
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By productIsAddedText = By.xpath("//p[@class='content']");
    By hdd_320GB = By.xpath("//input[@id");
}
