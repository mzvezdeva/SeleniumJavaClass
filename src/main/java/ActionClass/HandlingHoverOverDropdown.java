package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HandlingHoverOverDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");
        //before you use Actions Class you should initialize it and actions Class build up bunch of actions together first, and then you call perform method on it
        Actions builder = new Actions(driver);

        builder.moveToElement(driver.findElement(By.xpath("//div[@class='nav-menu-container']/ul/li[2]/a"))).perform(); //mover the mouse over dropdown to open up.
        // When you do 1 action like here you can use perform() not build(), but when you do more than one action, then use build()
        // When you call build() is going to return Action Interface, where is only one method-perform. When you call perform(), whatever action you called will be performed
        //WebDriverWait wait = new WebDriverWait(driver, 10);//wait the dropdown to show up
        // WebElement subSubList = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))));//wait until that one become clickable and return WebElement
        builder.moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).perform();//then move to that element and do another perform
        // WebElement subItem1= wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))));
        builder.click(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).perform();

        /* other way to do it
        builder.moveToElement(driver.findElement(By.xpath("//div[@class='nav-menu-container']/ul/li[2]/a")))
        .moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")))
        .click(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).build().perform();  //so here we are doing more than one action so its build()
         */
    }
}
