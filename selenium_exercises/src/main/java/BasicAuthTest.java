import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BasicAuthTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");   //droga na skróty! bleee
//        driver.get("https://the-internet.herokuapp.com/");
//        basicAuthTest(driver);
//        Alert alert = driver.switchTo (). alert();
//        alert.sendKeys("admin");
//
//        //alert.dismiss();
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("TEST PASSED");
//        //driver.close();
//    }
//    public static void basicAuthTest(ChromeDriver driver){
//        WebElement basicAuthLink = driver.findElementByXPath("//a[contains(text(),'Basic Auth')]");
//        basicAuthLink.click();
////        driver.findElement (By.name ("Nazwa użytkownika")). sendKeys ("admin");
////        driver.findElement (By.name ("Hasło")). sendKeys ("admin");
////        driver.findElement (By.name ("Zaloguj się")). submit ();
    }
}
