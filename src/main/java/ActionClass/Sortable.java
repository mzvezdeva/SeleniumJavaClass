package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Sortable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/sortable");
        driver.findElement(By.xpath("//a[contains(text(),'Grid')]")).click();

        Actions builder = new Actions(driver);
        builder.dragAndDrop(driver.findElement(By.xpath("//*[@class='create-grid']/div[text()='Four']")), driver.findElement(By.xpath("//*[@class='create-grid']/div[text()='One']")))
                .perform();
    }
}
