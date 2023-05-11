package pom_PageFactoryApproach_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom_PageFactoryApproach.RegisterPage;

public class RegisterTest
{
    WebDriver driver;

    pom_PageFactoryApproach.RegisterPage RP;   //We have created "LP" object for LoginPage //we need to create object for LoginPage to access all the data here in LoginTest



    @BeforeClass
    void setup() throws InterruptedException       //first we setup the method to open the browser
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        RP=new RegisterPage(driver);             //we need to initiate the object here
    }

    @Test
    void testRegister()                           //we are fetching the data straight from "Register Page"
    {
        RP.setClickOnRegister();                  //We are clicking on register to register the new account
        RP.setSelectGender();
        RP.setFirstName("Abhishek");
        RP.setLastName("Sanghavi");
        RP.setConfirmPassword("14");
        RP.setDateOfBirthMonth("July");
        RP.setDateOfBirthYear("1987");
        RP.setEnterEmail("admin123@gmail.com");
        RP.setEnterCompanyName("Marks Wholesale Ltd");
        RP.setClickOnNewsletter();
        RP.setEnterPassword("admin123");
        RP.setConfirmPassword("admin123");
        RP.setClickOnRegister_Btn();            //cicking on register button to register account
    }

    @AfterClass
        //we close the browser successfully
    void closeBrowser()
    {
        driver.close();
    }















}
