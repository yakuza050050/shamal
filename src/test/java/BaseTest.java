import driver.Driver;
import entity.User;
import helper.AlertHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import pages.courses.CoursesPage;
import pages.shamalLogin.DashboardNewPage;
import pages.shamalLogin.DashboardPage;
import pages.shamalLogin.LoginPage;
import pages.users.AddUserPage;
import pages.users.DeleteUsersPage;
import pages.users.UpdateUserPage;
import pages.users.UsersDashboard;
import utils.randomEntityUtils.RandomUserGenerate;

public class BaseTest {

    WebDriver driver;

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    DashboardNewPage dashboardNewPage = new DashboardNewPage();
    AddUserPage addUserPage = new AddUserPage();
    RandomUserGenerate randomUserGenerate = new RandomUserGenerate();
    CoursesPage coursesPage = new CoursesPage();
    UsersDashboard usersDashboard = new UsersDashboard();
    AlertHelper alertHelper;
    DeleteUsersPage deleteUsersPage = new DeleteUsersPage();
    UpdateUserPage updateUserPage = new UpdateUserPage();

    @BeforeSuite
    public void beforeSuite() {
         driver = Driver.getDriver();
         alertHelper = new AlertHelper(Driver.getDriver());
    }
}
