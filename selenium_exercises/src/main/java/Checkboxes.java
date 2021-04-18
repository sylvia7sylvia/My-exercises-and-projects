import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        clickCheckboxOne(driver);
        unclickCheckboxTwo(driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TEST PASSED");
        driver.close();
    }
    public static void clickCheckboxOne(ChromeDriver driver){
        WebElement checkboxesLink = driver.findElementByXPath("//a[contains(text(),'Checkboxes')]");
        checkboxesLink.click();
        WebElement checkboxOne = driver.findElementByXPath("//body/div[2]/div[1]/div[1]/form[1]/input[1]");
        checkboxOne.click();

    }
    public static void unclickCheckboxTwo(ChromeDriver driver){
        WebElement checkboxTwo = driver.findElementByXPath("//body/div[2]/div[1]/div[1]/form[1]/input[2]");
        checkboxTwo.click();
    }
}