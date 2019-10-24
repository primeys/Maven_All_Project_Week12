package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldBeNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputers();
        String expectedComText = "Computers";
        Assert.assertEquals(computersPage.verifyComputerText(),expectedComText);
    }

}
