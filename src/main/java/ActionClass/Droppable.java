package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Droppable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/droppable");
        WebElement dragItem = driver.findElement(By.id("draggable"));
        WebElement dropBox = driver.findElement(By.xpath("//*[@id='droppableExample-tabpane-simple']//div[@id='droppable']"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(dragItem, dropBox).perform(); //the moment you drop the item in the box,box change the color
        //will do verification by the new class added as soon as we drop it "highlight"
        System.out.println(dropBox.getCssValue("background-color")); //this is how you can get css value- 9a pic
    }
}
