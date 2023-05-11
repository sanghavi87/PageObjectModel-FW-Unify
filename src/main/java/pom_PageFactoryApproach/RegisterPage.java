package pom_PageFactoryApproach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{

    public WebDriver driver;


 // 1) Create Constructor :-
 //-----------------------

 public RegisterPage(WebDriver driver)
 {
     this.driver=driver;
     PageFactory.initElements(driver,this);
 }



 // 2) WebElements locators + identification:-
 //----------------------------------------------

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement pageLogo;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement clickOnRegister;


    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement selectGender;

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthday;

    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement enterEmail;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement enterCompanyName;

    @FindBy(xpath = "//input[@id='Newsletter']")
    WebElement clickOnNewsletter;

    @FindBy(xpath ="//*[@id=\"Password\"]" )
    WebElement enterPassword;

    @FindBy(xpath ="//*[@id=\"ConfirmPassword\"]" )
    WebElement confirmPassword;

    @FindBy(xpath ="//button[@id='register-button']" )
    WebElement clickOnRegister_Btn;



 // 3) Action Methods:-
 //----------------------

  public void setClickOnRegister()
  {
      clickOnRegister.click();
  }


  public void setSelectGender()
  {
      selectGender.click();
  }

  public void setFirstName(String firstName)
  {
      this.firstName.sendKeys(firstName);
  }

  public void setLastName(String lastName)
  {
    this.lastName.sendKeys(lastName);
  }

  public void setDateOfBirthday(String dateOfBirthday)
  {
     this.dateOfBirthday.sendKeys(dateOfBirthday);
  }

  public void setDateOfBirthMonth(String dateOfBirthMonth)
  {
      this.dateOfBirthMonth.sendKeys(dateOfBirthMonth);
  }

  public void setDateOfBirthYear(String dateOfBirthYear)
  {
      this.dateOfBirthYear.sendKeys(dateOfBirthYear);
  }

  public void setEnterEmail(String enterEmail)
  {
      this.enterEmail.sendKeys(enterEmail);
  }

  public void setEnterCompanyName(String enterCompanyName)
  {
      this.enterCompanyName.sendKeys(enterCompanyName);
  }

  public void setClickOnNewsletter()
  {
      this.clickOnNewsletter.click();
  }

  public void setEnterPassword(String enterPassword)
  {
      this.enterPassword.sendKeys(enterPassword);
  }

  public void setConfirmPassword(String confirmPassword)
  {
      this.confirmPassword.sendKeys(confirmPassword);
  }

  public void setClickOnRegister_Btn()
  {
      this.clickOnRegister_Btn.click();
  }

  public boolean checkLogoPresence()         //we're verifying the logo on this page
  {     boolean status= pageLogo.isDisplayed();
        return status;
  }

}
