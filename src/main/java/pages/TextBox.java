package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBox extends BasePages {

    @FindBy(id = "userName")
    public WebElement userElement;

}
