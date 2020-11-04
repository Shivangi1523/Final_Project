import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class website {
    @Test
    public static void websiteCount() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        List<WebElement> listImages=driver.findElements(By.tagName("img"));
        System.out.println("No. of Images: "+listImages.size());
        List<WebElement> count = driver.findElements(By.tagName("button"));
        System.out.println("No. of Buttons: "+count.size());

    }
}

