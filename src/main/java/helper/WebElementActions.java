package helper;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class WebElementActions {

    private Actions actions = new Actions(Driver.getDriver());

    public WebElementActions waitDisplayElements(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementActions waitElementClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementActions clickBtn(WebElement element) {
        waitDisplayElements(element);
        waitElementClickable(element);
        element.click();
        return this;
    }

    public WebElementActions inputInfo(WebElement element, String infoText) {
        waitDisplayElements(element);
        element.clear();
        element.sendKeys(infoText);
        return this;
    }

    public WebElementActions elementActions(WebElement element) {
        actions.moveToElement(element).perform();
        return this;
    }


}
