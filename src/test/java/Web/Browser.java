package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Browser {

    public static WebDriver driver = null;

    // method to launch webpage before every testcase
    // due to @BeforeMethod-annotation, the method will automatically execute before every @Test-method
    @BeforeMethod
    public static void openWebpage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }


    // method to close webpage after every testcase
    // due to @AfterMethod-annotation, the method will automatically execute after every @Test-method
    @AfterMethod
    public static void closeWebpage() {
        driver.quit();
    }


}
