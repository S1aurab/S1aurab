package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*isDisplayed()
isEnabled()
isSelected()
 */

public class ConditionalCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement logo =driver.findElement(By.xpath("(//img[@alt='nopCommerce demo store'])[1]"));
        System.out.println("status of the logo:"+logo.isDisplayed());
       boolean  search= driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
        System.out.println("status of the search box:"+search);


    }
}