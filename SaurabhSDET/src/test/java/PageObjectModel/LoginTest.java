package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void Setup(){
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    void testLogo(){
        LoginPage lp =new LoginPage(driver);

        Assert.assertEquals(" lp.Isdisplayed()",true );


    }

    @Test(priority = 2)
    void testLogin(){
        LoginPage lp=new LoginPage(driver);
        lp.setUsername("Admin");
        lp.setPassword("admin123");
        lp.Loginbtn();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");




    }
    @AfterTest
    void tearDown(){
        driver.close();
    }
}

