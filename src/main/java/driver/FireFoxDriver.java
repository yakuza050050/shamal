package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxDriver {

    public static WebDriver getLoadFireFox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
