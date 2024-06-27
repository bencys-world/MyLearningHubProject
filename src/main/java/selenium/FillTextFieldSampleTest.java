package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillTextFieldSampleTest {

    /**
     * Selenium sample to fill out a text field.
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");

        WebElement firstName = driver.findElement(By.id("fname"));
        firstName.sendKeys("Bency");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.id("lname"));
        lastName.sendKeys("Chennat");
        Thread.sleep(3000);
        driver.quit();


    }
}
