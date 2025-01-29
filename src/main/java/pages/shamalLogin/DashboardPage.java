package pages.shamalLogin;

import driver.Driver;
import entity.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePages;
import pages.users.AddUserPage;

public class DashboardPage extends BasePages {

    AddUserPage addUserPage = new AddUserPage();

    private WebElement getButtonByText(String buttonText) {
        String dynamicXpath = String.format("//a[normalize-space(text())='%s']", buttonText);
        return Driver.getDriver().findElement(By.xpath(dynamicXpath));
    }

    public DashboardPage navigationDashboard (String buttonText) {
        webElementActions.clickBtn(getButtonByText(buttonText));
        return this;
    }

    public AddUserPage addUser(User user) {
        webElementActions.inputInfo(addUserPage.firstNameElement, user.getFirstName())
                .inputInfo(addUserPage.lastNameElement, user.getLastName())
                .inputInfo(addUserPage.emailElement, user.getEmail())
                .inputInfo(addUserPage.loginElement, user.getUserLogin())
                .inputInfo(addUserPage.passwordElement, user.getPassword())
              .clickBtn(addUserPage.submitPersonalBtn);
        return new AddUserPage();
    }
}
