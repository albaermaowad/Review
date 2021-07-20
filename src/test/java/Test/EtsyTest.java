package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EtsyTest {

   @Test
    public void EtsyWallDecor() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/c/home-and-living/home-decor/wall-decor?ref=catnav-891");
        driver.manage().window().maximize();

        WebElement wallDecor = driver.findElement(By.partialLinkText("Wall Décor"));
        wallDecor.click();
        driver.close();




    }
}
