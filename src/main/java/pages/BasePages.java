package pages;

import driver.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePages {

    public BasePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
