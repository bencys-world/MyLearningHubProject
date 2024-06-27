package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Selenium example of radio option selection and de selection usecase.
 */
public class RadioOptionSampleTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://trytestingthis.netlify.app/");

        WebElement maleSex =driver.findElement(By.id("male"));
        WebElement femaleSex =driver.findElement(By.id("female"));
        maleSex.click();
        if(maleSex.isSelected()) {
            Thread.sleep(3000);
            femaleSex.click();
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
