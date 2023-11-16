package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GetNavigate {

    /*
    ..Exercise-1:...
        Create a new class with main method
        Set Path
        Create a chrome driver
        Maximize window
        Open google home page https://www.google.com
        On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        Wait about 4 sn
        Navigate forward to amazon
        Refresh page
        Close/quit the browser
        And Last step print "All is well" on console

     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Wedriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.google.com ");

        driver.navigate().to("http://www.amazon.com ");
        driver.navigate().back();

        Thread.sleep(4000);

        driver.navigate().forward();

        Thread.sleep(5000);
        driver.navigate().refresh();

        driver.quit();

        System.out.println("All is well");
    }
}
