package FindElementAndFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        List<WebElement> inputElements = driver.findElements(By.tagName("input")); //return list of elements
        int listSize = inputElements.size();  //will return the size of the list
        System.out.println("List size: " + listSize);  //print the size
    }
}
