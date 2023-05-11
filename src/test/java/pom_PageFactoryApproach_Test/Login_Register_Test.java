package pom_PageFactoryApproach_Test;

import com.demo.nopcommerce.Base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom_PageFactoryApproach.LoginPage;
import pom_PageFactoryApproach.RegisterPage;

import java.util.Properties;

public class Login_Register_Test {

    WebDriver driver;
    pom_PageFactoryApproach.RegisterPage RP;   //We have created "LP" object for LoginPage //we need to create object for LoginPage to access all the data here in LoginTest
    pom_PageFactoryApproach.LoginPage LP;    //We have created "LP" object for LoginPage //we need to create object for LoginPage to access all the data here in LoginTest
    //OR
    //LoginPage LP;
    Properties prop=new Properties();



    @BeforeClass
    void setup() throws InterruptedException       //first we setup the method to open the browser
    {
        BasePage basePage = new BasePage();
        prop = basePage.initialiseProperties();
        //basePage.initialiseDriver(prop.getProperty("browser"));
        // driver.get(prop.getProperty("url"));

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        LP=new LoginPage(driver);   //we always require to create loginpage (driver)
        RP=new RegisterPage(driver);             //we need to initiate the object here

    }

    @Test(priority = 1)
    void TestLogo()
    {
        Assert.assertEquals(LP.checkLogoPresence(),true);
    }


    @Test(priority = 2)
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



    @Test(priority = 3)
    void testLogin() throws InterruptedException
    {
        Thread.sleep(2000);
        LP.setClick_login();                    //we are clicking on the login button
        //LP.setUserName("admin123@gmail.com");  //we enter valid email
        //LP.setPassword("admin111");            //we enter valid password
        //LP.setBtn_login();                     //We click on the login button

        LP.login(prop.getProperty("username"),prop.getProperty("password"));

        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store1","Page is not matched..."); //we are validating the title

    }


    @AfterClass
        //we close the browser successfully
    void closeBrowser()
    {
        driver.quit();
    }

}
