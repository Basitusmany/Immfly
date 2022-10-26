package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

//This method will accept int (in second) and execute Thread.sleep for given duration

    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle){

        Set<String> allwindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allwindowsHandles) {
            Driver.getDriver().switchTo().window(each);

            System.out.println("Current Url() = " + Driver.getDriver().getCurrentUrl());
            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));



    }

    public static void verifyTitle(String expectedTitle){

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));


    }




}
