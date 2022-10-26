package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }


    @FindBy(xpath ="//input[@name='username']")
    public WebElement username;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement loginButton;


    //This a method that can login directly using of ConfigurationReader and properties file.
    public void loginWithConfig(){

        username.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        password.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        loginButton.click();



    }






}
