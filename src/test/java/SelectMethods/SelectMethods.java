package SelectMethods;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static SelectMethods.DriverManager.*;


public class SelectMethods {

    @Before
    public void setup() {
        DriverManager.initializeDriver();
    }


    @Test
    public void selectValues() {

        LoginTest.validateLogin();

        // Declare Web Element
        WebElement element = driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
        // Initialize select
        Select select = new Select(element);
//        select.selectByValue("za");
        select.selectByIndex(3);
        select.selectByVisibleText("Price (low to high)");


        if(select.isMultiple()) {
            System.out.println("Multiple Select Dropdown");
        }
        else{
            System.out.println("It is not a multiple select");
        }

    }

    @Test

    public void selectMultipleValues() {
        DriverManager.driver.navigate().to("https://only-testing-blog.blogspot.com/");
        WebElement multipleSelect = DriverManager.driver.findElement(By.id("listbox"));
        Select select = new Select(multipleSelect);

        // Validate MultipleSelect

        if(select.isMultiple()) {
            System.out.println("The dropdown is multiple select");
        }
        else {
            System.out.println("It is not a multiple select");
        }

//        String option1 = String.valueOf(select.getFirstSelectedOption());
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        List<WebElement> elements = select.getAllSelectedOptions();

        for(WebElement element1: elements) {
            System.out.println(element1.getAttribute("value"));
        }
    }


    @After
    public void exitValue() {
        driver.quit();
    }
}
