package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_ilkSeleniumTesti {
    /*
        Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de” adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/” adresine gidip
9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
     */

    public static void main(String[] args) {
        System.setProperty("Wedriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        driver.get("https://www.otto.de");

        String ottoUrl = driver.getCurrentUrl();
        String ottoTitle = driver.getTitle();

        System.out.println(ottoTitle);
        System.out.println(ottoUrl);
        if (ottoTitle.contains("0TT0") && ottoUrl.contains("0TT0")) {
            System.out.println("TITLE and URL TEST PASSED");
        } else {
            System.out.println("TITLE and URL TEST FAİLED");
        }

        driver.get("https://wisequarter.com/" );

        String wqTitle = driver.getTitle();
        boolean kelime = wqTitle.contains("Quarter");

        System.out.println(wqTitle);
        if (kelime){
            System.out.println("WİSE QUARTER TEST PASSED");
        }else {
            System.out.println("WİSE QUARTER TEST PASSED");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        System.out.println("------------ TEST TAMAMLANDI ------------");

        driver.quit();

    }
}
