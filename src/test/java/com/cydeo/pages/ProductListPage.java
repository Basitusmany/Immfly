package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    public ProductListPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "sorter")
    public WebElement sortBy_dropDown;

    @FindBy(xpath = "//option[@value='position']")
    public WebElement position;


}
