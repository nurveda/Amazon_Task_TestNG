package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@id='nav-tools']//a[2]")
    public WebElement helloSignBtn;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-newCust']//a")
    public WebElement startHereLink;

    @FindBy(xpath = "//span[@class='a-size-base a-color-base']")
    public WebElement youOnAmazonText;

}
