package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Slider {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/slider");

        WebElement slider= driver.findElement(By.xpath("//div[@class='col-9']/span")); //make sure you choose span tag !!!!

        Actions builder = new Actions(driver);
        builder.dragAndDropBy(slider,50,0).perform(); //because is just horizontal for y we are giving 0
    }

}
