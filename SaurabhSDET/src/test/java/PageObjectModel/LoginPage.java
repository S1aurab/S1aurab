package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    //constructor
    LoginPage(WebDriver driver){
        this.driver=driver;

    }
    //locators
    By logo_img= By.xpath("//img[@alt='company-branding']");
    By txt_username =By.xpath("//input[@placeholder='Username']");
    By txt_password=By.name("password");

    By loginbtn=By.cssSelector("button[type='submit']");

    //action method

    public void setUsername(String username){
        driver.findElement(txt_username).sendKeys(username);

    }
    public void setPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void Loginbtn(){
        driver.findElement(loginbtn).click();
    }
    public boolean Isdisplayed(){
       boolean status= driver.findElement(logo_img).isDisplayed();
      return status;

    }


}
