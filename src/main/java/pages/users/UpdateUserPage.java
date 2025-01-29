package pages.users;

import entity.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePages;

public class UpdateUserPage extends BasePages {

    AddUserPage addUserPage = new AddUserPage();

    @FindBy(xpath = "(//i[@title = \"Edit\"])[1]")
    public WebElement editUserElement;

    @FindBy(xpath = "//div[normalize-space(text())='User details updated successfully']")
    public WebElement updateUserSuccessfully;



    public AddUserPage updateUser(User user) {
        webElementActions.clickBtn(editUserElement);
        webElementActions.inputInfo(addUserPage.firstNameElement, user.getFirstName())
                .inputInfo(addUserPage.lastNameElement, user.getLastName())
                .clickBtn(addUserPage.submitPersonalBtn);
        System.out.println(updateUserSuccessfully.getText());
        Assert.assertEquals(updateUserSuccessfully.getText(), "User details updated successfully");


        return new AddUserPage();
    }
}
//ser details updated successfully