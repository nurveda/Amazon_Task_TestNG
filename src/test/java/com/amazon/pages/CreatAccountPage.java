package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccountPage extends HomePage{

    @FindBy(xpath = "//h1")
    public WebElement header;

    @FindBy(css = "#ap_customer_name")
    public WebElement nameInput;

    @FindBy(css = "#ap_email")
    public WebElement emailInput;

    @FindBy(css = "#ap_password")
    public WebElement passwordInp;

    @FindBy(css = "#ap_password_check")
    public WebElement reEntPasswordInp;

    @FindBy(css = "#continue")
    public WebElement submitBtn;


}
