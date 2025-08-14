import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Examples {

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void initializeDriver() {
        //Initialize driver
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        // Full screen of the window
       //  driver.manage().window().fullscreen();
    }

    // Test Method
    @Test
    public void validateTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Swag Labs", title);
        System.out.println("Test case 1: Passed directing to Swag Labs");
    }

    @Test
    public void validateLogin() {

        // Set the point
        Point point = driver.manage().window().getPosition();
        System.out.println(point.x);
        System.out.println(point.y);

        Point point1 = new Point(20, 20);
        driver.manage().window().setPosition(point1);

        // Different screen size
        Dimension dimension = new Dimension(1200, 1000);
        driver.manage().window().setSize(dimension);


        // Get the login details
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");


        if(driver.findElement(By.id("login-button")).isDisplayed()) {
            driver.findElement(By.id("login-button")).click();
        }
        else {
            System.out.println("Error submitting button");
        }

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", url);
        System.out.println("Test case 2: Passed Login Page");
    }


    @After
    public void close() {
        driver.quit();
    }

    public static void main(String[] args) {

    }
}
