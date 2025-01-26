package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ChromeDriver {

    public static WebDriver getLoadChrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
