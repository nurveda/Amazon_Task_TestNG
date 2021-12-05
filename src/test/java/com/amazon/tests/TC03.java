package com.amazon.tests;

import com.amazon.pages.CreatAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TC03 extends TestBase{


    @DataProvider
    public Object [][] CredentialsData(){

        String data[][]={

                {"Ramiz", "ramizKaraeski@gmail.com", "gucBizdenGelirYegen"},
                {"Polat", "polatAleemdar@hotmail.com", "sonunuDusunenKahramanOlamaz"},
                {"Cengiz", "cengizAtay@gmail.com", "benCengizAtayMahallenizinKaraKedisi"},

        };

        return data;
    }



    @Test ( dataProvider = "CredentialsData")
    public void testCase3(String name, String email, String password){

        extentLogger= report.createTest("Navigating to \"create an account\" page");

        HomePage homePage= new HomePage();
        CreatAccountPage creatAccountPage= new CreatAccountPage();

        extentLogger.info("User navigates to amazon.com");
        driver.get(ConfigurationReader.get("amazon_url"));

        extentLogger.info("User should hover over to the \"Hello, Sing in Account & Lists\" box");
        BrowserUtils.hover(homePage.helloSignBtn);

        extentLogger.info("User hits to \"Start Here\" link");
        homePage.startHereLink.click();

        extentLogger.info("User enters \"name\" to Your Name input box");
        creatAccountPage.nameInput.sendKeys(name);

        extentLogger.info("User enters \"email\" to Email input box");
        creatAccountPage.emailInput.sendKeys(email);

        extentLogger.info("User enters \"password\" to Password input box");
        creatAccountPage.passwordInp.sendKeys(password);

        extentLogger.info("User enters \"rePassword\" to rePassword input box");
        creatAccountPage.reEntPasswordInp.sendKeys(password);

        extentLogger.info("hits the \"Create your Amazon account\" button");
        creatAccountPage.submitBtn.click();

        extentLogger.info("the title changed to \"Authentication required\"");
        String expectedTitle= "Authentication required";
        String actualTitle= driver.getTitle();
        assertEquals(actualTitle,expectedTitle,"Make sure expected and actual titles are matching");






    }
}
