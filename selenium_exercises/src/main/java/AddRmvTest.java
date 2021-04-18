import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddRmvTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        addRemoveTest(driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TEST PASSED");
        //driver.close();
    }

    public static void addRemoveTest(ChromeDriver driver) throws InterruptedException {
        WebElement addRmLink = driver.findElementByXPath("//a[contains(text(),'Add/Remove Elements')]");
        addRmLink.click();
        TimeUnit.SECONDS.sleep(3);
        WebElement clickAdd = driver.findElementByXPath("//button[contains(text(),'Add Element')]");
        clickAdd.click();
        TimeUnit.SECONDS.sleep(3);
        WebElement clickDel = driver.findElementByXPath("//button[contains(text(),'Delete')]");
        clickDel.click();
    }
}
