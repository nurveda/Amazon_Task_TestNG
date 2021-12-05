package com.amazon.tests;

import com.amazon.pages.CreatAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TC02 extends TestBase{


    @Test
    public void testCase2(){

        extentLogger= report.createTest("Navigating to \"create an account\" page");

        HomePage homePage= new HomePage();
        CreatAccountPage creatAccountPage= new CreatAccountPage();

        extentLogger.info("User navigates to amazon.com");
        driver.get(ConfigurationReader.get("amazon_url"));

        extentLogger.info("user should hover over to the \"Hello, Sing in Account & Lists\" box");
        BrowserUtils.hover(homePage.helloSignBtn);

        extentLogger.info("hits to \"Start Here\" link");
        homePage.startHereLink.click();

        extentLogger.info("title should change to \"Amazon Registration\"");
        String actualTitle= driver.getTitle();
        String expectedTitle= "Amazon Registration";
        assertEquals(actualTitle,expectedTitle,"Make sure expected and actual titles are matching");

        extentLogger.info(("The header should be \"create account\""));
        String expectedHeader="Create account";
        String actualHeader= creatAccountPage.header.getText();
        assertEquals(actualHeader,expectedHeader,"Make sure the headers are matching");

        extentLogger.pass("PASSED");
    }


}
