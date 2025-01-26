import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void testBox() {
        driver.get("https://demoqa.com/text-box");
        textBox.userElement.sendKeys("Azamat");
    }
}
