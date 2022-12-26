package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","\\D:\\T-105 Selenium\\com.Team105Selenium\\src\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();

        System.out.println("All Ok");
    }
}
