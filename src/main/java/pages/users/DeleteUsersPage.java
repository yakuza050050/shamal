package pages.users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePages;

public class DeleteUsersPage extends BasePages {

    @FindBy(xpath = "//a[@class = \"btn dropdown-toggle\"]")
    public WebElement massActionElement;

    @FindBy(xpath = "//a[@class = \"massaction\" and normalize-space(text())=\"Delete\"]")
    public WebElement deleteUserElement;

    @FindBy(xpath = "//a[@id = \"submit-mass-action\"]")
    public WebElement acceptDeleteUser;

    @FindBy(xpath = "//div[normalize-space(text())='Successfully deleted 1 user']")
    public WebElement successfullyDeletedUser;

    public DeleteUsersPage deleteUsersPage() {
         webElementActions.clickBtn(massActionElement)
                .clickBtn(deleteUserElement)
                .clickBtn(acceptDeleteUser);
        System.out.println(successfullyDeletedUser.getText());
        Assert.assertEquals(successfullyDeletedUser.getText(), "Successfully deleted 1 user");
         return this;
    }


}
