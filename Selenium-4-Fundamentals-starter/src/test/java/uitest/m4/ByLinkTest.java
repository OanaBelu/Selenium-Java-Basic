package uitest.m4;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class ByLinkTest {
    WebDriver driver;

    @Test
    public void byLinkText() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);

        driver.findElement(By.linkText("Savings")).click();

        DemoHelper.pause();

        driver.findElement(By.partialLinkText("Reg")).click();

        DemoHelper.pause();
        driver.quit();
    }

}


