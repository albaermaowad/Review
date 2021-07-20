package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        btn1.click();
        String actualText = btn1.getAttribute("value");
        String expectedText = "I'm Feeling Lucky";
        if(actualText.equals(expectedText)){

            System.out.println("passed");
        }else{
            System.out.println("Failed");
            System.out.println("expected text: "+ expectedText);
        }
        Thread.sleep(2000);

     WebElement search = driver.findElement(By.name("q"));
     search.sendKeys("amazon");
     search.click();
     Thread.sleep(2000);
     search.click();
        Thread.sleep(2000);

        driver.close();

    }
}
