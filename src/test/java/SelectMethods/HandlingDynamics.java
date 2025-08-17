package SelectMethods;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

import static SelectMethods.DriverManager.driver;


public class HandlingDynamics {

    @Before
    public void setup() {
        DriverManager.initializeDriver();
    }

    @Test
    public void handlingDynamic() {


        // Credentials on variable
        String name = "standard_user";
        String password = "secret_sauce";

        // Use Xpath to validate the elements

        // Contains method //input[contains(@id, 'user')]
//       driver.findElement(By.xpath("//input[contains(@id, 'user')]")).sendKeys("standard_user");
//       driver.findElement(By.xpath("//input[contains(@id, 'user')]")).sendKeys("standard_user");
//       driver.findElement(By.xpath("//input[starts-with(@id, 'user')]")).sendKeys("standard_user");
//       driver.findElement(By.xpath("//input[@id='user-name' or @name='user-name']")).sendKeys("standard_user");
       driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).sendKeys(name);
       driver.findElement(By.xpath("//input[@id='password' and @name = 'password']")).sendKeys(password);
       driver.findElement(By.xpath("//input[@id = 'login-button' or @value ='login']")).click();

       String validUrl = "https://www.saucedemo.com/v1/inventory.html";
       Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", validUrl);

    }

}
