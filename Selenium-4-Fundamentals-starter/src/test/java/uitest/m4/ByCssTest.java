package uitest.m4;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static helper.Pages.HOME;



public class ByCssTest {
    WebDriver driver;

    @Test
    public void byCssSelector() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);


        var datePiker= driver.findElement(By.cssSelector("input[type=date]"));
        datePiker.sendKeys("10/12/1982");

        DemoHelper.pause();
        driver.quit();
    }

    @Test
    public void byCssSelector_2() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);


        var checkbox= driver.findElement(By.cssSelector("[type=checkbox]:not(:checked"));
        checkbox.click();

        DemoHelper.pause();
        driver.quit();
    }
}
