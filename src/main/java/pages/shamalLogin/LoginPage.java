package pages.shamalLogin;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePages;

import java.time.Duration;

public class LoginPage extends BasePages {

    @FindBy(xpath = "//input[@name = \"login\"]")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@name = \"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name = \"submit\"]")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@class = \"toast-message\"]")
    public WebElement errorElement;

    @FindBy(xpath = "//span[normalize-space(text()) = \"'Username or email' is required\"]")
    public WebElement loginRequireElement;

    @FindBy(xpath = "//span[normalize-space(text()) = \"'Password' is required\"]")
    public WebElement passwordRequireElement;


    public DashboardNewPage loginPage(String loginInput, String passwordInput) {
        webElementActions.inputInfo(this.loginInput, loginInput)
                .inputInfo(this.passwordInput, passwordInput)
                .clickBtn(submitBtn);
        return new DashboardNewPage();
    }

}
