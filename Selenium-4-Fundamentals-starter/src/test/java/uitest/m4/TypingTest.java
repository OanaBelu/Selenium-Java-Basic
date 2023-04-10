package uitest.m4;
import java.lang.*;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class TypingTest {

    @Test
    public void typingTest() {
        WebDriver driver = DriverFactory.newDriver();

        driver.get(HOME);

        WebElement first = driver.findElement(By.id("firstName"));
        WebElement last = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement dob = driver.findElement(By.id("dob"));

        first.sendKeys("Oana");
        last.sendKeys("Belu");
        email.sendKeys("george@gmail.com");

        DemoHelper.pause();

        email.clear();
        email.sendKeys("oana.belu@gmail.com");
        dob.sendKeys("04/04/2023");

        DemoHelper.pause();
        driver.quit();


    }
}
