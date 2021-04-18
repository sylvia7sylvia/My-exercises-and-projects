import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KainosWorkDayLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://kainos.wd3.myworkdayjobs.com/Kainos/");
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(5);
        acceptCookies(driver);
        singInButton(driver);
        singInPopUp(driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TEST PASSED");
        //driver.close();
    }

    public static void acceptCookies(ChromeDriver driver) {
        WebElement acceptButton = driver.findElementByXPath("//span[contains(text(),'Accept Cookies')]");
        acceptButton.click();
    }

    public static void singInButton(ChromeDriver driver) {
        WebElement singInButton = driver.findElementByXPath("//span[contains(text(),'Sign In')]");
        singInButton.click();
        WebElement singInPopUpWindow = driver.findElementByXPath("//body/div[6]/div[1]/div[1]/div[1]/div[2]");
        singInPopUpWindow.click();
    }

    public static void singInPopUp(ChromeDriver driver) {
        WebElement searchEmailBox = driver.findElementByXPath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]");
        searchEmailBox.click();
        searchEmailBox.sendKeys("user@email.com");
        WebElement searchPasswordBox = driver.findElementByXPath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/input[1]");
        searchPasswordBox.click();
        searchPasswordBox.sendKeys("password");
        WebElement singIn = driver.findElementByXPath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]");
        singIn.click();
    }
}
