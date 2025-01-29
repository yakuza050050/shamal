package pages.users;

import com.beust.ah.A;
import driver.Driver;
import helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePages;

import java.time.Duration;

public class UsersDashboard extends BasePages {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    AlertHelper alertHelper = new AlertHelper(Driver.getDriver());

    @FindBy(xpath = "//tr[@class = \"odd\"]")
    public WebElement parentElements;

    @FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
    public WebElement checkedElement;



    public UsersDashboard userDashboard() {

        webElementActions.elementActions(parentElements)
        .clickBtn(checkedElement);

        return this;
    }
}
