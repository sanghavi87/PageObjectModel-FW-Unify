package com.demo.nopcommerce.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils
{
    WebDriver driver;

<<<<<<< HEAD
    public Utils (WebDriver driver)
=======
    public Utils (WebDriver driver)    //
>>>>>>> 62833ca (pom)
    {
        this.driver = driver;
    }

<<<<<<< HEAD
    public WebElement getElement(By locator)
=======
    public WebElement getElement(By locator)    //getelement is nothing but findelement
>>>>>>> 62833ca (pom)
    {
        WebElement element =driver.findElement(locator);
        return element;
    }
    public void  doClick(By locator)
    {
        getElement(locator).click();
    }
    public void doSendKey(By locator, String value)
    {
        getElement(locator).sendKeys(value);
    }
    public String waitForTitlePresent(int timeout, String titleValue)
    {
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.titleIs(titleValue));
        return driver.getTitle();
    }


}
