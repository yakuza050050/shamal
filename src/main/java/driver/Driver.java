package driver;

import fileUtils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperties("browserType").toLowerCase().trim()) {
                case "chrome":
                    driver = ChromeDriver.getLoadChrome();
                    break;
                case "firefox":
                    driver = FireFoxDriver.getLoadFireFox();
                  break;
                default:
                    throw new IllegalArgumentException("Other Browser type" + ConfigReader.getProperties("browserType"));
            }
        }

        return driver;
    }
}
