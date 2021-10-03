package FindElementAndFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        //you have to initialize the Chrome browser
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to a webpage
        driver.get("https://www.facebook.com");
        //locate a WebElement
        WebElement element = driver.findElement(By.id("email")); //if you put not unique path the method will return the first on the list but if it`s wrong locator will return exception
        element.sendKeys("john@gmail.com");  //insert the info that you provide
        //Perform Action on Element
        driver.quit();

    }
}
