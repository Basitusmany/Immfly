package com.cydeo.pages;

import com.cydeo.step_definitions.OrderStepDefinition;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage {

    public OrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//button[.=\"Order\"]")
    public WebElement orderButton;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement product;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNo;

    @FindBy(xpath = "//input[@placeholder='e.g. 04/24']")
    public WebElement ExpiryDate;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processOrder;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public WebElement verify;













}
