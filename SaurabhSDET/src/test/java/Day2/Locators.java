package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.evershop.io/");
        driver.findElement(By.linkText("Men")).click();
           List<WebElement > images=driver.findElements(By.tagName("img"));
        System.out.println(images.size());
        driver.quit();
    }
}
