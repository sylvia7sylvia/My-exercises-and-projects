import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");   //droga na skróty! bleee
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TEST PASSED");
        driver.close();
    }
}
