package ActionMethods;

import SelectMethods.DriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static SelectMethods.DriverManager.driver;


public class ActionClass {

    @Before
    public void setup() {
        DriverManager.initializeDriver();
    }

    @Test
    public void actionClass() {

        // Handing Actions
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.id("user-name"));
        action.moveToElement(element).click(element).sendKeys("standard_user").build().perform();
    }

    @Test
    public void alertBox() {
        driver.navigate().to("https://only-testing-blog.blogspot.com/");
        WebElement alertElement = driver.findElement(By.xpath("//button[text()='Alert']"));
        Actions action = new Actions(driver);

    }

    @After
    public void endDriver() {
        driver.quit();
    }
}
