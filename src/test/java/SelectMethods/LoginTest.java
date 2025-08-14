package SelectMethods;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static SelectMethods.DriverManager.driver;

public class LoginTest {


    @Test
    public static void validateLogin() {

        DriverManager.initializeDriver();

        // Login to the user page
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Validate the Login button is clickable
        if(driver.findElement(By.id("login-button")).isDisplayed()) {
            driver.findElement(By.id("login-button")).submit();
        }
        else {
            System.out.println("Error Logging the user");
        }   

        // Validate if the login is successful
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", url);
        System.out.println("Test Case - Login Successful");
    }


    @After
    public void endValidateLogin() {
        driver.quit();
    }
}
