package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ComputersPage extends Util {
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By computerVerifyText = By.xpath("//h1[contains(text(),'Computers')]");
    By desktopsImage = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By noteBooksImage = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    By softwareImage = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");

    public void mouseOverComputer() {
        mouseHoverToElement(computersLink);
        clickOnElement(computersLink);
    }

    public String verifyComputerText() {
        return getTextFromElement(computerVerifyText);
    }
    public void clickOnDesktopImage() {
        clickOnElement(desktopsImage);
    }

    public void clickOnNoteBooksImage() {
        clickOnElement(noteBooksImage);
    }

    public void clickOnSoftwareImage() {
        clickOnElement(softwareImage);
    }


}
