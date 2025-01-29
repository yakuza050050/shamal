package pages;

import driver.Driver;
import helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public class BasePages {

   public WebElementActions webElementActions = new WebElementActions();

    public BasePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
