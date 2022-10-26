package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;

public class DropDownPage {

    public DropDownPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(xpath ="//select[@id='month']" )
    public WebElement monthDropdown;





}
