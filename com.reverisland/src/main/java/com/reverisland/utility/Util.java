package com.reverisland.utility;

import com.reverisland.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Util extends BasePage {
    /**
     *
     * @Click on Element By Locator
     */

    public void clickOnElement (By by){
        driver.findElement(by).click();
    }

    /**
     *
     * @param webElement
     *
     */

    public void clickOnElement (WebElement webElement){
        webElement.click();
    }
    /**
     *
     * @String By by
     * @return text from element
     */
    public String getTextFromElement (By by){
        return driver.findElement(by).getText();
    }

    /**
     *
     * @param webElement
     * @return Text from WebElement
     */

    public String getTextFromElement (WebElement webElement){
        return webElement.getText();
    }

    public void sendTextToElement (By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * This method will used to hover mouse on element and click
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /**
     * This method will used to select drop down menu by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String str) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(str);
    }





}
