package utils.randomEntityUtils;

import com.github.javafaker.Faker;
import entity.User;
import org.testng.Assert;
import pages.users.AddUserPage;

public class RandomUserGenerate {


    Faker faker = new Faker();

    public String randomFirstName() {
        return faker.name().firstName();
    }

    public String randomLastName() {
        return faker.name().lastName();
    }

    public String randomEmail() {
        return faker.internet().emailAddress();
    }

    public String randomPassword() {
        return faker.internet().password(8, 16, true, true, true);
    }

    public String randomLogin() {
        return faker.name().username();
    }

    public User randomUser() {
        System.out.println(randomPassword());
        return new User(randomFirstName(), randomLastName(), randomEmail(), randomLogin(),  randomPassword());
    }



}
