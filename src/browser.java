import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class browser {
    @Test
    public static void browserAssertion() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ca/");
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),ActualTitle);
    }
}
