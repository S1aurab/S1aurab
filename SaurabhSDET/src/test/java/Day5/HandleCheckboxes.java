package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //select one specific check box
      //  driver.findElement(By.xpath("//input[@id='monday']")).click();
        //total no. of check box
       List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        System.out.println("total no. fo checkboxes:"+checkboxes.size());

        //select all the check boxes
       /* for(int i=0;i<checkboxes.size();i++){

            checkboxes.get(i).click();
        }*/
      //  select last two checkbox
     //   for(int i=5;i< checkboxes.size();i++){
           // checkboxes.get(i).click();
    //    }

//unselect all the checkbox
          for(int i=0;i<checkboxes.size();i++){

            checkboxes.get(i).click();
        }
          Thread.sleep(3000);
           for(int i=0;i<checkboxes.size();i++){

            checkboxes.get(i).click();
        }
    }
}
