package pages.courses;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePages;
import pages.users.UsersDashboard;

public class CoursesPage extends BasePages {


    @FindBy(xpath = "//a[@title = \"Users\"]")
    public WebElement linkUserElement;


    public UsersDashboard goToUserDashboard() {
        webElementActions.clickBtn(linkUserElement);
        return new UsersDashboard();
    }
}
