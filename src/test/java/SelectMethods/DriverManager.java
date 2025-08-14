package SelectMethods;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverManager {
    public static WebDriver driver;
    WebDriverWait wait;


    public static void initializeDriver() {
        // Initialize Driver
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }

}
