package com.reverisland.basetest;

import com.reverisland.basepage.BasePage;
import com.reverisland.browserselector.BrowserSelector;
import com.reverisland.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage {

    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod

    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void closeDown(){
        driver.quit();
    }



}
