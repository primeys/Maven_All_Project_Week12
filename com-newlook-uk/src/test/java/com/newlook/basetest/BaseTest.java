package com.newlook.basetest;

import com.newlook.basepage.BasePage;
import com.newlook.browserselector.BrowserSelector;
import com.newlook.loadproperty.LoadProperty;
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
    public void tearDown(){
        driver.quit();;
    }





}
