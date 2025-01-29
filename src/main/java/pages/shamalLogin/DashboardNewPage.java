package pages.shamalLogin;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePages;

import java.time.Duration;

public class DashboardNewPage extends BasePages {

    @FindBy(xpath = "//span[@class = \"arrow-down\"]")
    public WebElement downElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'Go to legacy interface']")
    public WebElement goLegacyElement;



    public DashboardPage goToNewDashboard() {
        webElementActions.clickBtn(downElement)
                .clickBtn(goLegacyElement);
        return new DashboardPage();
    }
}
