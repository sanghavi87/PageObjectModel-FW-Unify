package pom_PageFactoryApproach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
 public WebDriver driver;


 // 1) Create Constructor :-
 //-----------------------

 public LoginPage(WebDriver driver)
 {
     this.driver=driver;
     PageFactory.initElements(driver,this); //as we are using driver in parameter so we don't require driver. in "action method"
 }



 // 2) WebElements Locator + Identification :-
 //------------------------------------------

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement pageLogo;

    @FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement click_OnLogin;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement enter_email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement enter_password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement clickOnLoginSubmit_btn;




  // 3) Action Method:-
  //------------------

    public void setClick_login()        //first we click on the login
    {
        click_OnLogin.click();
    }

  /* public void setUserName(String userName)  //we pass the email id
   {
       enter_email.sendKeys(userName);
   }

   public void setPassword(String password)  //we entering password
   {
       enter_password.sendKeys(password);
   }

   public void setBtn_login()  //we click on the login to get successfully login
   {
       clickOnLoginSubmit_btn.click();
   }*/

   public boolean checkLogoPresence()         //we're verifying the logo on this page
   {
       boolean status= pageLogo.isDisplayed();
       return status;
   }


   public void login(String userName, String password)
   {
       enter_email.sendKeys(userName);
       enter_password.sendKeys(password);
       clickOnLoginSubmit_btn.click();
   }




































}
