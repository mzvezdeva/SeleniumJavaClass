package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButton {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.id("email_create")).sendKeys("mira@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("customer_firstname")).sendKeys("Mira");
        driver.findElement(By.id("customer_lastname")).sendKeys("Hristova");
        //driver.findElement(By.id("email")).sendKeys("mira@gmail.com");  //website fill it in automatically
        driver.findElement(By.id("passwd")).sendKeys("Mira2021");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
        Thread.sleep(2000);

        driver.quit();

    }
}
