package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

/**
 *   Sample code to select single, multi dropdown values via Selenium webdriver 4.0 version.
 *   I use https://trytestingthis.netlify.app/  for this test.
 */
public class DropDownSampleTest {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://trytestingthis.netlify.app/");
        WebElement dropDown = driver.findElement(By.id("owc"));
        Thread.sleep(3000);
        Select selectObj = new Select(dropDown);
        selectObj.selectByIndex(3);
        Thread.sleep(3000);
        selectObj.deselectByIndex(3);
        Thread.sleep(3000);
        selectObj.selectByIndex(1);

        List<WebElement> allOptions = selectObj.getOptions();

        for(WebElement each : allOptions) {
            System.out.println(each.getText());
        }

        //Multi selection
        selectObj.selectByIndex(1);
        selectObj.selectByIndex(2);
        selectObj.selectByIndex(3);

        Thread.sleep(3000);
        driver.quit();

    }
}
