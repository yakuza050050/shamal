import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import pages.TextBox;

public class BaseTest {

    WebDriver driver;
    TextBox textBox = new TextBox();

    @BeforeSuite
    public void beforeSuite() {
         driver = Driver.getDriver();
    }
}
