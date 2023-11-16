package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Wedriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.navigate().to("http://www.wisequarter.com ");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.wisequarter.com ");

        driver.quit();
    }
}
