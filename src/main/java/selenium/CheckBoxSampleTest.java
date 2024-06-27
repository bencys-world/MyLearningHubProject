package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class CheckBoxSampleTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver webdriver = new ChromeDriver();

        webdriver.get("https://trytestingthis.netlify.app/");
        List<WebElement> selections = webdriver.findElements(By.id("moption"));
        Thread.sleep(3000);
        for(int i=0;i<selections.size();i++) {
            if(i==0 || i==2 || i==1 ) {
                Thread.sleep(1000);
                ((WebElement) selections.get(i)).click();
            }

        }

        Thread.sleep(3000);
        webdriver.quit();


    }
}
