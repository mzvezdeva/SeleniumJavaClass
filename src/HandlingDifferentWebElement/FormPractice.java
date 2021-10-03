package HandlingDifferentWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FormPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();   //make your window bigger
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.id("email_create")).sendKeys("mira@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@class='radio-inline']"));
        for (WebElement radioB : radioButtons) {
            System.out.println(radioB.getText());
            if (radioB.getText().trim().equalsIgnoreCase("Mrs.")) {
                radioB.click();
            }
        }
        driver.findElement(By.id("customer_firstname")).sendKeys("Mira");
        driver.findElement(By.id("customer_lastname")).sendKeys("Hristova");
        driver.findElement(By.id("passwd")).sendKeys("Edyhtl89$");
        Thread.sleep(2000);
        driver.findElement(By.id("days")).click();
        List<WebElement> optionDate = driver.findElements(By.xpath("//select[@id='days']//option"));
        for (WebElement option : optionDate) {
            if (option.getAttribute("value").equalsIgnoreCase("10")) {
                option.click();
            }
        }
        driver.findElement(By.id("days")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
