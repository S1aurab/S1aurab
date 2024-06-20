package Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.sendKeys("Welcome saurabh sharma");
        myalert.accept();

        //validation
        String ac_text = driver.findElement(By.id("//p[@id='result']")).getText();
        String exp_text = "Welcome saurabh sharma";
        if (ac_text.equals(exp_text)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}






