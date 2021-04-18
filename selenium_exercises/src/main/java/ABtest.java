import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ABtest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        abTest(driver);
        driver.close();
    }
    public static void abTest(ChromeDriver driver) throws InterruptedException {
        WebElement abTestLink = driver.findElementByXPath("//a[contains(text(),'A/B Testing')]");
        abTestLink.click();
        TimeUnit.SECONDS.sleep(5);
    }
}
