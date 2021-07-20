package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPractice {

    @Test
    public void MissingPasswordField(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");

        WebElement signIn = driver.findElement(By.className("login"));
        signIn.click();
        WebElement UserName = driver.findElement(By.id("email"));
        UserName.sendKeys("testng@gmail.com");
        WebElement Sign = driver.findElement(By.id("SubmitLogin"));
        Sign.click();

        String missingPasswordMessage = driver.findElement(By.className("alert alert-danger")).getText();
        Assert.assertEquals(missingPasswordMessage, "Password is required.");



    }
}
