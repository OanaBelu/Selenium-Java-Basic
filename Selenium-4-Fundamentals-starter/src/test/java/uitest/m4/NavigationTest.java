package uitest.m4;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static helper.Pages.HOME;


public class NavigationTest {
    private static final String PREFIX = "file:///" + System.getProperty("user.dir") + "\\src\\web\\" ;


    @Test
    public void basicNavigationTest() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
        driver.get(PREFIX + "index.html");

        DemoHelper.pause();
        driver.get(PREFIX + "savings.html");

        DemoHelper.pause();
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

// Close all tabs and windows
        driver.quit();
    }

    @Test
    public void basicNavigationTestRefactored() {
        WebDriver driver = DriverFactory.newDriver();

        driver.get(HOME);

        WebElement input = driver.findElement(By.id("firstName"));
        System.out.println(input.isDisplayed());

        WebElement button = driver.findElement(By.id("register"));
        System.out.println(button.getText());

        button.click();


        driver.quit();
    }
}


