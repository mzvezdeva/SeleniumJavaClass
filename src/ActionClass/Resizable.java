package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Resizable {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/resizable");
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(driver.findElement(By.xpath("//*[@id='resizableBoxWithRestriction']/span")),100,50).perform();


    }
}
