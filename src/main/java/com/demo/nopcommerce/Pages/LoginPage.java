package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Constant;
import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    Utils utils;

//1. Create your page object/object repository in the form of By Locators
 By loginLink =  By.className("ico-login");
 By emailId = By.id("Email");
 By passWord = By.id("Password");
 By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

//2. Create a constructor of page class
 public LoginPage (WebDriver driver){
     this.driver = driver;
     utils = new Utils(driver);
 }

//3. Page Actions

    public void clickOnLoginLink()
    {
     utils.doClick(loginLink);
    }

    public String getPageTitle()
    {
     return utils.waitForTitlePresent(5, Constant.LOGIN_PAGE_TITLE);
    }

    public void doLogin(String Username, String Password){
     utils.doSendKey(emailId,Username);
     utils.doSendKey(passWord,Password);
     utils.doClick(loginButton);
    }


}
