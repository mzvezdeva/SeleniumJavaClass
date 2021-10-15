package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Draggable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //here you should get an item,drag, but you do not really have destination to drop it somewhere around the page, by using X and Y Coordinates.
        // The whole structure of the page is X and Y Coordinates, and we give coordinates for x and y where we want the drag item to be dropped,
        // but we didn`t do x&y that much because if you run your test on more pixel monitor later on, maybe your code will not work, on that way your code will be not stable
        //when you are working with drag and drop usually is going to be horizontal or vertical, or to drop it to exact destination like a box,and we will use Actions Class to handle this

        driver.get("https://demoqa.com/dragabble");

        Actions builder= new Actions(driver);

        builder.dragAndDropBy(driver.findElement(By.id("dragBox")),200,200).perform();

        driver.quit();

    }
}
