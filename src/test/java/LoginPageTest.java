import driver.Driver;
import entity.User;
import fileUtils.ConfigReader;
import lombok.Data;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.shamalLogin.LoginPage;

public class LoginPageTest extends BaseTest {





        @Test
        public void loginTest () {
            driver.get("https://shamal.talentlms.com/index");


           User randomUser = randomUserGenerate.randomUser();

            loginPage.loginPage(ConfigReader.getProperties("login"), ConfigReader.getProperties("password"))
                    .goToNewDashboard().navigationDashboard ("Add user")
                            .addUser(randomUser);

            coursesPage.goToUserDashboard().userDashboard();
            updateUserPage.updateUser(randomUser);
            coursesPage.goToUserDashboard().userDashboard();
            deleteUsersPage.deleteUsersPage();


        }

    @Test
    public void negativeLoginTestWithInvalidCredentials() {
        driver.get("https://shamal.talentlms.com/index");

        // Негативный тест: вход с неверными данными
        loginPage.loginPage(ConfigReader.getProperties("invalidLogin"), ConfigReader.getProperties("invalidPassword"));

        // Проверка сообщения об ошибке
        Assert.assertEquals(loginPage.errorElement.getText(), "Сообщение об ошибке не соответствует ожидаемому");
    }

    @Test
    public void negativeLoginTestWithEmptyFields() {
        driver.get("https://shamal.talentlms.com/index");

        // Негативный тест: вход с пустыми полями
        loginPage.loginPage("", "");

        SoftAssert softAssert = new SoftAssert();

        // Выполняем проверки
        softAssert.assertEquals(loginPage.loginRequireElement.getText(), "Заполните поле логина", "Сообщение для логина не соответствует ожидаемому.");
        softAssert.assertEquals(loginPage.passwordRequireElement.getText(), "Заполните поле пароля", "Сообщение для пароля не соответствует ожидаемому.");

        // Подтверждаем все проверки
        softAssert.assertAll();
    }


    }

