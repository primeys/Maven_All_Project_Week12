package com.primark.basetest;

import com.primark.basepage.BasePage;
import com.primark.browserselector.BrowserSelector;
import com.primark.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp(){browserSelector.selectBrowser(browser);}

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
