package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ToolTips {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/tool-tips");
        //so when you hover over you show see a massage, so you should move the mouse on it, locate the element and verify the massage
        Actions builder = new Actions(driver);
        //First ToolTip where the tooltip content is part of the title attribute of the element
        builder.moveToElement(driver.findElement(By.id("toolTipTextField"))).perform();
        Thread.sleep(2000);
        String toolTip = driver.findElement(By.id("toolTipTextField")).getAttribute("aria-describedby");
        System.out.println(toolTip);

        builder.moveToElement(driver.findElement(By.id("toolTipButton"))).perform();
        Thread.sleep(2000);
        String toolTip1 = driver.findElement(By.id("toolTipButton")).getAttribute("aria-describedby");
        System.out.println(toolTip1);
    }
}
