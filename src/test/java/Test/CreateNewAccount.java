package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateNewAccount {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }

    @Test
    public void NewAccount() throws InterruptedException {
        WebElement signIn = driver.findElement(By.className("login"));
       signIn.click();
       WebElement create = driver.findElement(By.id("email_create"));
       create.sendKeys("test@gmail.com");
       WebElement Submit = driver.findElement(By.id("SubmitCreate"));
       Submit.click();
        Thread.sleep(3000);
       WebElement Message = driver.findElement(By.id("create_account_error"));
       Message.getText();


        Assert.assertEquals(Message, "An account using this email address has already been registered. Please enter a valid password or request a new one.");

    }

    @AfterTest
    public void tearDown(){

        driver.close();
    }




}
