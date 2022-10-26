package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepage {

    public Googlepage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='Aceptar todo']")
    public WebElement acceptAlert;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearchInput;






}
