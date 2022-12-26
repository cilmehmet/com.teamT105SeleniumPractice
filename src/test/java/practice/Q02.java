package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {

    public static void main(String[] args) throws InterruptedException {

       /* ...Exercise2...
         1 - Driver olusturalim
         2 - Java class'imiza chromedriver.exe'yi tanitalim
         3 - Driver'in tum ekrani kaplamasini saglayalim
         4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
             söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
         5 - "https://www.otto.de" adresine gidelim
         6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
         7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
         8 - Ardindan "https://wisequarter.com/" adresine gidelim
         9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
             kontrol edelim
         10- Bir onceki web sayfamiza geri donelim
         11- Sayfayi yenileyelim
         12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
         13- En son adim olarak butun sayfalarimizi kapatmis olalim
             */

        System.setProperty("webdriver.chrome.driver","\\D:\\T-105 Selenium\\com.Team105Selenium\\src\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        String expData="OTTO";
        if (title.contains(expData))
            System.out.println("Test PASSED");
        else
            System.out.println("OTTO title Test FAILED");

        if (url.contains(expData))
            System.out.println("Test PASSED");
        else
            System.out.println("OTTO url Test FAILED");

        driver.navigate().to("https://wisequarter.com/");

        String titleQuarter = driver.getTitle();
        String urlQuarter = driver.getCurrentUrl();

        String expDataQuarter="Quarter";

        if (titleQuarter.contains(expDataQuarter))
            System.out.println("Test PASSED");
        else
            System.out.println("Quarter title Test FAILED");
        if (urlQuarter.contains(expDataQuarter))
            System.out.println("Test PASSED");
        else
            System.out.println("Quarter url Test FAILED");

        driver.navigate().back();
        //  11- Sayfayi yenileyelim

        driver.navigate().refresh();

        driver.navigate().forward();
        driver.close();

        driver.quit();
    }
}
