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

public class ByIdClassTagTest {
    WebDriver driver;

    @Test
    public void byId() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        driver.findElement(By.id("register")).click();

        DemoHelper.pause();
        driver.quit();
    }

    @Test
    public void byClassName() {
        driver = DriverFactory.newDriver();
        driver.get(HOME);
        driver.findElement(By.id("register")).click();

        List<WebElement> feedbackList = driver.findElements(By.className("invalid-feedback"));

        Assert.assertEquals(feedbackList.get(0).getText(),"Valid first name is required");
        Assert.assertEquals(feedbackList.get(1).getText(),"Valid last name is required");
        Assert.assertEquals(feedbackList.get(2).getText(),"Please enter a valid email address");

        DemoHelper.pause();
        driver.quit();
    }

    @Test
    public void byTagName() {
        driver = DriverFactory.newDriver();
        driver.get(SAVINGS);

        WebElement table = driver.findElement(By.id("rates"));
        WebElement sameTable = driver.findElement(By.tagName("table"));

        System.out.println(table.getText());
        System.out.println(sameTable.getText());

    }



    @AfterMethod
    public void cleanup() {
        driver.quit();

    }

}
