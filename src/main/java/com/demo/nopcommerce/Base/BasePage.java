package com.demo.nopcommerce.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;  // when you pass at the bottom the file path (resources) so to read that data we need to use "FileInputStream"

    public WebDriver initialiseDriver(String browserName) {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser not Matched");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;
    }

    public Properties initialiseProperties()
    {

       prop = new Properties();
        try
        {
           file = new FileInputStream("C:\\Users\\abhis\\IdeaProjects\\PageObjectModel_FW_Unify\\src\\test\\resources\\TestData\\config.properties");
            prop.load(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Config file is not found, please check.........");
        }catch (IOException e){
            System.out.println("Properties could not be loaded");
        }

        return prop;
    }
}
