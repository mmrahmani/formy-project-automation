import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Matt");

        driver.findElement(By.id("last-name")).sendKeys("Rahmani");

        driver.findElement(By.id("job-title")).sendKeys("Automation Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        /*WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement dropDownItem =wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector("option[value='3']")));*/


        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("18/04/2020");
        datePicker.sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']")).click();

        driver.quit();
    }
}
