package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/*get(URL)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getWindowHandles()
*/

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
        System.out.println("the title of the page:" +driver.getTitle());
        System.out.println("the current url of the page is :"+driver.getCurrentUrl());

      //  System.out.println(driver.getWindowHandle());
        Thread.sleep(3000);

        driver.findElement(new By.ByLinkText("OrangeHRM, Inc")).click();
        Set<String> windows=driver.getWindowHandles();
        for(String winid:windows)
        {
            System.out.println(winid);
        }



    }

}
