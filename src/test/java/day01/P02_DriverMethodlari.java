package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Wedriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.wisequarter.com ");

        driver.quit();
    }
}
