package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownwithSelecttag {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".btn.btn-black.navbar-btn")).click();
        WebElement dropcounele =driver.findElement(By.xpath("//select[@id='input-country']"));
        Select dropcountry=new Select(dropcounele);

        //selecting an option from the dropdown

        dropcountry.selectByVisibleText("Australia");

    }
}
