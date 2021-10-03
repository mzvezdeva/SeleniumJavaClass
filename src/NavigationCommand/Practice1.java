package NavigationCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        String facebookUrl = "https://facebook.com";
        String amazonUrl = "https://www.amazon.com";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(facebookUrl);
        Thread.sleep(2000);

        driver.navigate().to(amazonUrl);
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().to(facebookUrl);
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();
    }
}
