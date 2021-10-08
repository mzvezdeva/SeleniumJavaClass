package JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class JavaScriptActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");

        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement firstNameElem=driver.findElement(By.id("firstName"));
        //sending keys in JavaScript
        je.executeScript("arguments[0].setAttribute('value','Mitko');",firstNameElem);
        //do click on the gender radio button element
        WebElement genderElm= driver.findElement(By.id("gender-radio-1"));
        je.executeScript("arguments[0].click();",genderElm);
        WebElement submitButton= driver.findElement(By.id("submit"));
        //scroll down to view
        je.executeScript("arguments[0].scrollIntoView(true);",submitButton);
        //click on submit- with JavaScript is not necessary to scroll down because it do it pretty fast
        je.executeScript("arguments[0].click()",submitButton);
    }
}
