package com.amazon.tests;

import com.amazon.pages.HomePage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TC01 extends TestBase{

    @Test
    public void testCase01(){
        extentLogger = report.createTest("Navigating Homepage");

        HomePage homePage= new HomePage();

        extentLogger.info("User navigates to amazon.com");
        driver.get(ConfigurationReader.get("amazon_url"));

        extentLogger.info("User should be on the homepage");
        assertTrue(homePage.youOnAmazonText.getText().contains("You are on amazon.com."));

        extentLogger.pass("PASSED");

    }





}
