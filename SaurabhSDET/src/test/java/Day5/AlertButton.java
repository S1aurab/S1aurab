package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertButton {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
      // Alert alertwindow = (Alert) driver.switchTo().alert();
       AlertButton my= (AlertButton) mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(my.getClass());


    }
}
