package pages.users;

import entity.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePages;

public class AddUserPage extends BasePages {

    @FindBy(xpath = "//input[@name = \"name\"]")
    public WebElement firstNameElement;

    @FindBy(xpath = "//input[@name = \"surname\"]")
    public WebElement lastNameElement;

    @FindBy(xpath = "//input[@name = \"email\"]")
    public WebElement emailElement;

    @FindBy(xpath = "//input[@name = \"login\"]")
    public WebElement loginElement;

    @FindBy(xpath = "//input[@name = \"password\"]")
    public WebElement passwordElement;

    @FindBy(xpath = "//input[@name = \"submit_personal_details\"]")
    public WebElement submitPersonalBtn;


    @FindBy(xpath = "//span[text() = \"This is not a valid 'Email address'\"]")
    public WebElement errorEmailInput;

}
